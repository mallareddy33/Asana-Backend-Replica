package com.asana.replica.service;

import com.asana.replica.dto.UserDto;

import java.util.List;

public interface UserService {

    List<UserDto> listUsers(String workspaceGid);

    UserDto getByGid(String userGid);
}
