package com.bootcamp.dto;

import com.bootcamp.model.Category;
import java.time.LocalDateTime;

public record ProductResponse(

        Long id,
        String name,
        Double price,
        String description,
        Category category,
        Integer stock,
        LocalDateTime createdAt
) {}