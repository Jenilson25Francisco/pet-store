package com.zanguetsuinc.petstoreapi.domain.service;

import com.zanguetsuinc.petstoreapi.domain.model.Pet;
import com.zanguetsuinc.petstoreapi.domain.model.User;
import com.zanguetsuinc.petstoreapi.domain.repository.PetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.OffsetDateTime;

@Service
@RequiredArgsConstructor
public class CreatePetService {

    private final PetRepository petRepository;
    private final CreateUserService createUserService;

    @Transactional
    public Pet createPet(Pet pet){

        User user = createUserService.buscar(pet.getUser().getId());

        pet.setUser(user);
        pet.setCreatedAt(OffsetDateTime.now());

        return petRepository.save(pet);
    }

}
