package com.zanguetsuinc.petstoreapi.api.controller;

import com.zanguetsuinc.petstoreapi.api.assembler.PetAssembler;
import com.zanguetsuinc.petstoreapi.api.dto.PetDto;
import com.zanguetsuinc.petstoreapi.api.request.PetRequest;
import com.zanguetsuinc.petstoreapi.domain.model.Pet;
import com.zanguetsuinc.petstoreapi.domain.repository.PetRepository;
import com.zanguetsuinc.petstoreapi.domain.service.CreatePetService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/pets")
@AllArgsConstructor
public class PetController {

    private PetRepository petRepository;
    private CreatePetService createPetService;
    private PetAssembler petAssembler;

    @GetMapping
    public List<PetDto> listAll(){
        return petAssembler.toCollectionModel(petRepository.findAll());
    }

    @GetMapping("{petId}")
    public ResponseEntity<PetDto> getPet(@PathVariable UUID petId){
        return petRepository.findById(petId)
                .map(pet -> ResponseEntity.ok(petAssembler.toDto(pet)))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PetDto savePet(@Valid @RequestBody PetRequest petRequest){

        Pet newPet = petAssembler.toRequest(petRequest);
        Pet savedPet = createPetService.createPet(newPet);

        return petAssembler.toDto(savedPet);

    }

}
