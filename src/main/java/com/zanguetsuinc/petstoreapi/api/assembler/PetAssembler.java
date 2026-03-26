package com.zanguetsuinc.petstoreapi.api.assembler;

import com.zanguetsuinc.petstoreapi.api.dto.PetDto;
import com.zanguetsuinc.petstoreapi.api.request.PetRequest;
import com.zanguetsuinc.petstoreapi.domain.model.Pet;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PetAssembler {

    private ModelMapper modelMapper;

    public PetDto toDto(Pet pet){
        return modelMapper.map(pet, PetDto.class);
    }

    public List<PetDto> toCollectionModel(List<Pet> pets){
        return pets.stream()
                .map(this::toDto)
                .toList();
    }

    public Pet toRequest(PetRequest petRequest){
        return modelMapper.map(petRequest, Pet.class);
    }

}
