package com.zanguetsuinc.petstoreapi.domain.service;

import com.zanguetsuinc.petstoreapi.domain.exceptions.NegocioException;
import com.zanguetsuinc.petstoreapi.domain.model.User;
import com.zanguetsuinc.petstoreapi.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.OffsetDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateUserService {

    private final UserRepository userRepository;

    public User busccar(UUID userId){
        return userRepository.findById(userId)
                .orElseThrow(() -> new NegocioException("Usario não encontrado"));
    }

    @Transactional
    public User create(User user){

        boolean emailEmUso = userRepository.findByEmail(user.getEmail())
                        .stream()
                                .anyMatch(existUser -> !existUser.equals(user));

        if(emailEmUso){
            throw new NegocioException("já existe um usuario com este e-mail");
        }

        user.setCreatedAt(OffsetDateTime.now());


        return userRepository.save(user);
    }

}
