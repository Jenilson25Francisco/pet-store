package com.zanguetsuinc.petstoreapi.api.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

public record UserDto(UUID id, String nome, String email, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
}
