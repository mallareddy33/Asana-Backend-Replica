package com.asana.replica.mapper;

import com.asana.replica.dto.*;
import com.asana.replica.model.Project;
import com.asana.replica.model.Tag;
import com.asana.replica.model.Task;
import com.asana.replica.model.User;

import java.util.List;

public class TaskMapper {

    private static final String RESOURCE_TYPE = "task";

    public static TaskDto toDto(Task task) {
        User assignee = task.getAssignee();

        UserRef assigneeRef = assignee != null
                ? new UserRef(assignee.getId(), "user", assignee.getName())
                : null;

        List<ProjectRef> projectRefs = task.getProjects().stream()
                .map(TaskMapper::toProjectRef)
                .toList();

        List<TagRef> tagRefs = task.getTags().stream()
                .map(TaskMapper::toTagRef)
                .toList();

        return new TaskDto(
                task.getId(),
                RESOURCE_TYPE,
                task.getName(),
                task.getNotes(),
                task.isCompleted(),
                task.getCompletedAt(),
                task.getDueOn(),
                task.getPriority(),
                assigneeRef,
                projectRefs,
                tagRefs,
                task.getCreatedAt(),
                task.getUpdatedAt()
        );
    }

    private static ProjectRef toProjectRef(Project p) {
        return new ProjectRef(p.getId(), "project", p.getName());
    }

    private static TagRef toTagRef(Tag t) {
        return new TagRef(t.getId(), "tag", t.getName());
    }

    /**
     * Apply updates from request onto existing Task entity.
     */
    public static void applyUpdate(Task task, TaskUpdateRequest request, User newAssignee) {
        if (request.name() != null) {
            task.setName(request.name());
        }
        if (request.notes() != null) {
            task.setNotes(request.notes());
        }
        if (request.completed() != null) {
            boolean completed = request.completed();
            task.setCompleted(completed);
            task.setCompletedAt(completed ? java.time.OffsetDateTime.now() : null);
        }
        if (request.due_on() != null) {
            task.setDueOn(request.due_on());
        }
        if (request.priority() != null) {
            task.setPriority(request.priority());
        }
        if (request.assignee_gid() != null) {
            task.setAssignee(newAssignee);
        }
    }
}
