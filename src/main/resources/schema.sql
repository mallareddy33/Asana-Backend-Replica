-- Core schema for Asana-like backend (PostgreSQL 15)
-- IDs use text to mirror Asana-style identifiers
-- Adjust/extend as needed.

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

-- WORKSPACES
CREATE TABLE workspaces (
    id              text PRIMARY KEY,
    name            text NOT NULL,
    email_domains   text[] DEFAULT '{}',
    is_organization boolean DEFAULT false,

    created_at      timestamptz NOT NULL DEFAULT now(),
    updated_at      timestamptz NOT NULL DEFAULT now()
);

-- USERS
CREATE TABLE users (
    id              text PRIMARY KEY,
    name            text NOT NULL,
    email           text,
    photo_url       text,
    is_active       boolean DEFAULT true,

    workspace_id    text REFERENCES workspaces(id) ON DELETE SET NULL,

    created_at      timestamptz NOT NULL DEFAULT now(),
    updated_at      timestamptz NOT NULL DEFAULT now()
);

CREATE INDEX idx_users_workspace_id ON users(workspace_id);
CREATE UNIQUE INDEX idx_users_email_unique ON users(email) WHERE email IS NOT NULL;

-- TEAMS
CREATE TABLE teams (
    id              text PRIMARY KEY,
    name            text NOT NULL,
    description     text,

    workspace_id    text NOT NULL REFERENCES workspaces(id) ON DELETE CASCADE,

    created_at      timestamptz NOT NULL DEFAULT now(),
    updated_at      timestamptz NOT NULL DEFAULT now()
);

CREATE INDEX idx_teams_workspace_id ON teams(workspace_id);

-- TEAM MEMBERSHIPS (user-to-team)
CREATE TABLE team_memberships (
    id              uuid PRIMARY KEY DEFAULT uuid_generate_v4(),

    team_id         text NOT NULL REFERENCES teams(id) ON DELETE CASCADE,
    user_id         text NOT NULL REFERENCES users(id) ON DELETE CASCADE,
    role            text, -- e.g. "member", "admin"

    created_at      timestamptz NOT NULL DEFAULT now()
);

CREATE UNIQUE INDEX idx_team_memberships_unique
    ON team_memberships(team_id, user_id);

-- PROJECTS
CREATE TABLE projects (
    id              text PRIMARY KEY,
    name            text NOT NULL,
    notes           text,
    color           text,
    is_archived     boolean DEFAULT false,
    start_on        date,
    due_on          date,
    current_status  text, -- simple status text; richer history via stories

    workspace_id    text NOT NULL REFERENCES workspaces(id) ON DELETE CASCADE,
    team_id         text REFERENCES teams(id) ON DELETE SET NULL,

    created_at      timestamptz NOT NULL DEFAULT now(),
    updated_at      timestamptz NOT NULL DEFAULT now()
);

CREATE INDEX idx_projects_workspace_id ON projects(workspace_id);
CREATE INDEX idx_projects_team_id ON projects(team_id);

-- PROJECT MEMBERSHIPS (user-to-project)
CREATE TABLE project_memberships (
    id              uuid PRIMARY KEY DEFAULT uuid_generate_v4(),

    project_id      text NOT NULL REFERENCES projects(id) ON DELETE CASCADE,
    user_id         text NOT NULL REFERENCES users(id) ON DELETE CASCADE,
    role            text, -- e.g. "member", "owner"

    created_at      timestamptz NOT NULL DEFAULT now()
);

CREATE UNIQUE INDEX idx_project_memberships_unique
    ON project_memberships(project_id, user_id);

-- SECTIONS (a.k.a. columns/lists in a project)
CREATE TABLE sections (
    id              text PRIMARY KEY,
    name            text NOT NULL,
    position        numeric(18,6), -- for ordering within project

    project_id      text NOT NULL REFERENCES projects(id) ON DELETE CASCADE,

    created_at      timestamptz NOT NULL DEFAULT now(),
    updated_at      timestamptz NOT NULL DEFAULT now()
);

CREATE INDEX idx_sections_project_id ON sections(project_id);

-- TASKS
CREATE TABLE tasks (
    id                  text PRIMARY KEY,
    name                text NOT NULL,
    notes               text,
    completed           boolean DEFAULT false,
    completed_at        timestamptz,
    due_on              date,
    due_at              timestamptz,
    start_on            date,
    start_at            timestamptz,
    priority            text,

    assignee_id         text REFERENCES users(id) ON DELETE SET NULL,
    created_by_id       text REFERENCES users(id) ON DELETE SET NULL,

    workspace_id        text NOT NULL REFERENCES workspaces(id) ON DELETE CASCADE,

    created_at          timestamptz NOT NULL DEFAULT now(),
    updated_at          timestamptz NOT NULL DEFAULT now()
);

CREATE INDEX idx_tasks_workspace_id ON tasks(workspace_id);
CREATE INDEX idx_tasks_assignee_id ON tasks(assignee_id);
CREATE INDEX idx_tasks_completed ON tasks(completed);
CREATE INDEX idx_tasks_due_on ON tasks(due_on);

-- TASK <-> PROJECT (many-to-many)
CREATE TABLE task_projects (
    task_id         text NOT NULL REFERENCES tasks(id) ON DELETE CASCADE,
    project_id      text NOT NULL REFERENCES projects(id) ON DELETE CASCADE,
    is_primary      boolean DEFAULT false,

    PRIMARY KEY (task_id, project_id)
);

CREATE INDEX idx_task_projects_project_id ON task_projects(project_id);

-- TASK <-> SECTION (many-to-one via join for ordering within section)
CREATE TABLE task_sections (
    task_id         text NOT NULL REFERENCES tasks(id) ON DELETE CASCADE,
    section_id      text NOT NULL REFERENCES sections(id) ON DELETE CASCADE,
    position        numeric(18,6),

    PRIMARY KEY (task_id, section_id)
);

CREATE INDEX idx_task_sections_section_id ON task_sections(section_id);

-- TAGS
CREATE TABLE tags (
    id              text PRIMARY KEY,
    name            text NOT NULL,
    color           text,

    workspace_id    text NOT NULL REFERENCES workspaces(id) ON DELETE CASCADE,

    created_at      timestamptz NOT NULL DEFAULT now(),
    updated_at      timestamptz NOT NULL DEFAULT now()
);

CREATE INDEX idx_tags_workspace_id ON tags(workspace_id);

-- TASK <-> TAG (many-to-many)
CREATE TABLE task_tags (
    task_id         text NOT NULL REFERENCES tasks(id) ON DELETE CASCADE,
    tag_id          text NOT NULL REFERENCES tags(id) ON DELETE CASCADE,

    PRIMARY KEY (task_id, tag_id)
);

CREATE INDEX idx_task_tags_tag_id ON task_tags(tag_id);

-- STORIES (comments, status updates, system events on tasks/projects)
CREATE TABLE stories (
    id              text PRIMARY KEY,
    type            text NOT NULL, -- e.g. "comment", "system", "status_update"
    text            text,

    task_id         text REFERENCES tasks(id) ON DELETE CASCADE,
    project_id      text REFERENCES projects(id) ON DELETE CASCADE,

    author_id       text REFERENCES users(id) ON DELETE SET NULL,

    created_at      timestamptz NOT NULL DEFAULT now(),
    updated_at      timestamptz NOT NULL DEFAULT now()
);

CREATE INDEX idx_stories_task_id ON stories(task_id);
CREATE INDEX idx_stories_project_id ON stories(project_id);
CREATE INDEX idx_stories_author_id ON stories(author_id);

-- SIMPLE FOLLOWERSHIP (user following tasks/projects)
CREATE TABLE task_followers (
    task_id         text NOT NULL REFERENCES tasks(id) ON DELETE CASCADE,
    user_id         text NOT NULL REFERENCES users(id) ON DELETE CASCADE,

    PRIMARY KEY (task_id, user_id)
);

CREATE TABLE project_followers (
    project_id      text NOT NULL REFERENCES projects(id) ON DELETE CASCADE,
    user_id         text NOT NULL REFERENCES users(id) ON DELETE CASCADE,

    PRIMARY KEY (project_id, user_id)
);

-- Basic updated_at trigger (optional; uncomment if you want automatic timestamps)
-- CREATE OR REPLACE FUNCTION set_updated_at()
-- RETURNS trigger AS $$
-- BEGIN
--   NEW.updated_at = now();
--   RETURN NEW;
-- END;
-- $$ LANGUAGE plpgsql;
--
-- CREATE TRIGGER set_timestamp
-- BEFORE UPDATE ON workspaces
-- FOR EACH ROW
-- EXECUTE PROCEDURE set_updated_at();
--
-- -- Repeat triggers for other tables as desired.
