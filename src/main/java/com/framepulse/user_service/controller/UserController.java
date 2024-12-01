package com.framepulse.user_service.controller;

import com.framepulse.user_service.dto.UserDto;
import com.framepulse.user_service.entity.User;
import com.framepulse.user_service.mapper.UserMapper;
import com.framepulse.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/all")
    public List<User> finalAll() {
        return userService.findAll();
    }

    @GetMapping("/{userId}")
    public Optional<User> findById(@PathVariable String userId) {
        return userService.findById(userId);
    }

    @PostMapping
    public UserDto save(@RequestBody UserDto user) {
        User _user = userMapper.dtoToEntity(user);
        _user = userService.save(_user);
        user = userMapper.entityToDto(_user);
        return user;
    }

    @PutMapping
    public UserDto update(@RequestBody UserDto user) {
        User _user = userMapper.dtoToEntity(user);
        _user = userService.update(_user);
        user = userMapper.entityToDto(_user);
        return user;
    }

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable String userId) {
        userService.deleteById(userId);
    }
}
