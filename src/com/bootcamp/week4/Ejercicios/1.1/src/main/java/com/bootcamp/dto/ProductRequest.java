package com.bootcamp.dto;

import com.bootcamp.model.Category;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public record ProductRequest(

        @NotBlank
        String name,

        @Positive
        Double price,

        String description,

        Category category,

        @PositiveOrZero
        Integer stock
) {}