package com.framepulse.user_service.mapper;

import com.framepulse.user_service.dto.UserDto;
import com.framepulse.user_service.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends AbstractMapper<User, UserDto>{}
