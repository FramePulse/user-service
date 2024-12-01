package com.framepulse.user_service.mapper;

import com.framepulse.user_service.dto.UserDto;
import com.framepulse.user_service.entity.User;
import org.mapstruct.Mapper;

public interface AbstractMapper<E,D> {
    public E dtoToEntity(D dto);
    public D entityToDto(E entity);
}
