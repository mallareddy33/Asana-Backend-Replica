package com.asana.replica.service.impl;

import com.asana.replica.dto.UserDto;
import com.asana.replica.exception.NotFoundException;
import com.asana.replica.mapper.UserMapper;
import com.asana.replica.model.User;
import com.asana.replica.repository.UserRepository;
import com.asana.replica.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public List<UserDto> listUsers(String workspaceGid) {
        List<User> users;
        if (workspaceGid != null) {
            users = userRepository.findByWorkspace_Id(workspaceGid);
        } else {
            users = userRepository.findAll();
        }

        return users.stream()
                .map(UserMapper::toDto)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public UserDto getByGid(String userGid) {
        User user = userRepository.findById(userGid)
                .orElseThrow(() -> new NotFoundException("User not found: " + userGid));
        return UserMapper.toDto(user);
    }
}
