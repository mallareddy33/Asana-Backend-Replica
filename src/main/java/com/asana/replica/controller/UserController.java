package com.asana.replica.controller;

import com.asana.replica.api.DataListResponse;
import com.asana.replica.api.DataResponse;
import com.asana.replica.dto.UserDto;
import com.asana.replica.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public DataListResponse<UserDto> listUsers(
            @RequestParam(name = "workspace", required = false) String workspaceGid
    ) {
        List<UserDto> users = userService.listUsers(workspaceGid);
        return new DataListResponse<>(users);
    }

    @GetMapping("/{user_gid}")
    public DataResponse<UserDto> getUser(@PathVariable("user_gid") String userGid) {
        UserDto user = userService.getByGid(userGid);
        return new DataResponse<>(user);
    }
}

