package com.zanguetsuinc.petstoreapi.domain.service;

import com.zanguetsuinc.petstoreapi.domain.model.User;
import com.zanguetsuinc.petstoreapi.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
@RequiredArgsConstructor
public class CreateUserService {

    private final UserRepository userRepository;

    public User create(User user){

        user.setCreatedAt(OffsetDateTime.now());


        return userRepository.save(user);
    }

}
