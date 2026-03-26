package com.zanguetsuinc.petstoreapi.api.controller;

import com.zanguetsuinc.petstoreapi.api.assembler.UserAssembler;
import com.zanguetsuinc.petstoreapi.api.dto.UserDto;
import com.zanguetsuinc.petstoreapi.api.request.UserRequest;
import com.zanguetsuinc.petstoreapi.domain.model.User;
import com.zanguetsuinc.petstoreapi.domain.repository.UserRepository;
import com.zanguetsuinc.petstoreapi.domain.service.CreateUserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

    private UserRepository userRepository;
    private UserAssembler userAssembler;
    private CreateUserService createUserService;

    @GetMapping
    public List<UserDto> listar(){
        return userAssembler.toCollectionModel(userRepository.findAll());
    }

    @GetMapping("{userId}")
    public ResponseEntity<UserDto> getUser(@PathVariable UUID userId){
        return userRepository.findById(userId)
                .map(user -> ResponseEntity.ok(userAssembler.toDto(user)))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto criar(@Valid @RequestBody UserRequest userRequest){
        User newUser = userAssembler.toResponse(userRequest);
        User saveUser = createUserService.create(newUser);

        return userAssembler.toDto(saveUser);
    }

}
