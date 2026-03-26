package com.zanguetsuinc.petstoreapi.api.assembler;

import com.zanguetsuinc.petstoreapi.api.dto.UserDto;
import com.zanguetsuinc.petstoreapi.api.request.UserIdRequest;
import com.zanguetsuinc.petstoreapi.api.request.UserRequest;
import com.zanguetsuinc.petstoreapi.domain.model.User;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

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

    public User toResponse(UserRequest userRequest){
        return modelMapper.map(userRequest, User.class);
    }

    public User toResponse(UserIdRequest userIdRequest){
        return modelMapper.map(userIdRequest, User.class);
    }

}
