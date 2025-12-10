package com.asana.replica.mapper;

import com.asana.replica.dto.UserDto;
import com.asana.replica.model.User;

public class UserMapper {

    private static final String RESOURCE_TYPE = "user";

    public static UserDto toDto(User u) {
        return new UserDto(
                u.getId(),
                RESOURCE_TYPE,
                u.getName(),
                u.getEmail(),
                u.getPhotoUrl(),
                u.getIsActive(),
                u.getWorkspace() != null ? u.getWorkspace().getId() : null,
                u.getCreatedAt(),
                u.getUpdatedAt()
        );
    }
}
