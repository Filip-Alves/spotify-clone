package com.me.spotifyclone.usercontext.mapper;

import com.me.spotifyclone.usercontext.ReadUserDTO;
import com.me.spotifyclone.usercontext.domain.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    ReadUserDTO readUserDTOToUser(User entity);

}
