A backend service that replicates the core subset of Asana’s REST API, modeled closely against Asana’s official OpenAPI specification, and built to be incrementally extensible using automated code generation + LLM-assisted agents.

This backend supports Workspaces, Users, Teams, Projects, Sections, Tasks, Stories, and Tags — and returns Asana-shaped JSON responses (correct resource_type, gid, field names, and list/response envelopes).

📌 1. Goals of the Project

        Implement a replica of the core Asana backend:

        Workspaces

        Users

        Teams

        Projects

        Sections

        Tasks

        Tags

        Stories

        Ensure outputs match Asana’s response structure exactly.

        Provide a backend that can be:

        Easily extended with new API endpoints

        Automatically compared against the Asana OpenAPI spec

        Deployable via Docker

        Demonstrate agent-powered development using OpenAI / Cursor / LLM-based tooling.

📦 2. High-Level Architecture

+------------------------+
|      REST Layer        |
| (Controllers: Asana-like)
+-----------+------------+
            |
            v
+------------------------+
|      Service Layer     |
|  Business logic, validations,
|  Asana-like pagination, filters
+-----------+------------+
            |
            v
+------------------------+
|       Repository       |
|    (Spring Data JPA)   |
+-----------+------------+
            |
            v
+------------------------+
|       PostgreSQL       |
| schema.sql (v1, v2…)   |
+------------------------+

🧱 3. Project Structure

asana-backend/
 ├── src/main/java/com/asana/replica/
 │    ├── controller/      # REST endpoints (mirror Asana paths)
 │    ├── service/         # Business logic interfaces
 │    ├── service/impl/    # Implementations
 │    ├── repository/      # JPA Repositories
 │    ├── model/           # Entities (Workspace, Project, Task…)
 │    ├── dto/             # Request/response DTOs
 │    ├── mapper/          # Entity → DTO mappers (Asana format)
 │    └── AsanaReplicaApplication.java
 │
 ├── src/main/resources/
 │    ├── schema.sql       # DB initialization (versioned)
 │    └── application.yml
 │
 ├── Dockerfile
 ├── docker-compose.yml
 ├── openapi/
 │    └── asana_oas.yaml   # Official Asana OpenAPI spec (reference)
 │
 └── README.md

🤖 4. How Agents Helped Build This Project

Modern backend scaffolding for large APIs (like Asana) is too slow to write manually.

We used agents (ChatGPT/OpenAI/Cursor) for:
    1. Automatic DTO + Controller Stub Generation

    Using the Asana OpenAPI YAML:

    Generate full controller method signatures

    Generate request/response DTOs

    Produce Asana-like JSON envelopes ({ "data": ... })

    Ensure routes match Asana (/workspaces/{workspace_gid}, /projects/{gid}, etc.)

    2. Database Schema Generation

    The agent converted Asana models → SQL tables automatically:

    Workspaces

    Teams

    Team Memberships

    Projects

    Sections

    Tasks

    Tags

    Stories

    Plus join tables and foreign key relationships.

    3. Validation of API correctness

    Agents compared:
    ours swagger.json
    vs
    asana_oas.yaml

    Listing mismatches:

    missing fields

    incorrect datatypes

    nullable vs non-nullable differences

    envelope differences

    This ensures future accuracy.

    4. Incremental API expansion strategy

    Whenever Asana adds a new endpoint, an agent:

    Reads their new OpenAPI version

    Highlights structural diffs

    Generates required:

    schema changes

    repository queries

    controller methods

    DTOs

🔍 5. How We Compare Our API to Asana’s
    We maintain:
    /openapi/asana_oas.yaml    ← Official spec
    /openapi/local.yaml        ← Our generated Swagger from SpringDoc

    A diff tool or agent runs comparisons:

    Example mismatches detected:
    | Issue Type        | Example                                              |
    | ----------------- | ---------------------------------------------------- |
    | Missing field     | `is_archived` not included in project DTO            |
    | Wrong type        | `email_domains` was String[] → fixed to List<String> |
    | Envelope mismatch | Asana uses `{ "data": {...} }` always                |
    | Nullability diff  | Asana returns `false`, our DB returned `null`        |

    This allows us to upgrade correctness, just like a schema validator.

 🧩 6. Versioning & Incremental Schema Evolution
 Asana continuously adds features.
 Your backend must handle evolving API models without breaking existing clients.

 Strategy used here:
 ✔ schema.sql is versioned logically

  We maintain conceptual versions:

    schema_v1.sql   → core entities
    schema_v2.sql   → add portfolios (future)
    schema_v3.sql   → add custom fields (future)

Only schema_v1.sql auto-runs.

Future migrations become Liquibase/Flyway scripts:

V2__add_portfolios_table.sql
V3__add_custom_fields.sql

✔ Backward compatibility

When adding new fields:

Always make columns NULLABLE by default.

Services ignore unknown fields when rendering old DTOs.

New endpoints versioned or optional via query params.

Example:

Adding Asana "Project Brief" later:

    ALTER TABLE projects ADD COLUMN brief TEXT NULL;
DTO upgrade:
   String brief = entity.getBrief() == null ? "" : entity.getBrief();

Old clients still work.

🚀 7. Running the Project
    mvn clean package
    Run with Docker:
        docker-compose up --build
    Containers created:

    asana-backend-app (Spring Boot)

    asana-postgres-db (PostgreSQL)

    API runs on:
       http://localhost:8080

🧪 8. Testing API Endpoints
    Create Workspace
    curl --location 'http://localhost:8080/workspaces' \
    --header 'Content-Type: application/json' \
    --data '{
      "name": "My Workspace"
    }'
    Get Workspace
    curl http://localhost:8080/workspaces/{gid}

    Create Project
    curl --location 'http://localhost:8080/projects' \
    --header 'Content-Type: application/json' \
    --data '{
      "name": "Backend System",
      "workspace": "ws_123",
      "team": "team_345"
    }'

    Get Tasks in Section
    curl 'http://localhost:8080/tasks?section=sec_123'

📚 9. How to Add New Asana APIs
    Step 1 — Update Asana OpenAPI (drop new YAML into /openapi/)

    Step 2 — Use agent to diff specs
    Example prompt:
    “Compare my local OpenAPI to Asana’s and tell me what DTOs, controllers, and DB tables are missing.”

    Step 3 — Generate new stubs
    Controller + DTO + Service interfaces are auto-generated.

    Step 4 — Add schema changes as new migration file
    src/main/resources/db/migration/V2__add_portfolios.sql

    Step 5 — Implement service logic

    Step 6 — Validate Asana response format
    Use agent to check:
    Does my new API match Asana's JSON envelope?
    
🎯 10. Why This Approach is Valuable
    ✔ Shows practical ability to build a large REST API fast
    ✔ Demonstrates modern engineering: LLM-assisted development
    ✔ Clean layering and professional architecture
    ✔ Correctness driven by OpenAPI parity
    ✔ Extensible to 100+ endpoints without complexity
    ✔ Ready for cloud deployment (Docker, Infra-as-Code optional)