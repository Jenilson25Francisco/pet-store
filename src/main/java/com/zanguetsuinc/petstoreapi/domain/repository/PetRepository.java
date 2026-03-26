package com.zanguetsuinc.petstoreapi.domain.repository;

import com.zanguetsuinc.petstoreapi.domain.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PetRepository extends JpaRepository<Pet, UUID> {
}
