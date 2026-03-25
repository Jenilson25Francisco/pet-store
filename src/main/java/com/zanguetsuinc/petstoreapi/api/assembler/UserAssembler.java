package com.zanguetsuinc.petstoreapi.api.assembler;

import com.zanguetsuinc.petstoreapi.api.dto.UserDto;
import com.zanguetsuinc.petstoreapi.api.response.UserResponse;
import com.zanguetsuinc.petstoreapi.domain.model.User;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.lang.reflect.Type;
import java.util.List;

@Component
@AllArgsConstructor
public class UserAssembler {

    private ModelMapper modelMapper;

    public UserDto toDto(User user){
        return modelMapper.map(user, UserDto.class);
    }

    public List<UserDto> toCollectionModel(List<User> users){
        return users.stream().map(this::toDto)
                .toList();
    }

    public User toResponse(UserResponse userResponse){
        return modelMapper.map(userResponse, User.class);
    }

}
