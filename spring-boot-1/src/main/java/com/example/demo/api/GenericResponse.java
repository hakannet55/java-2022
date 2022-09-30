package com.example.demo.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class GenericResponse {

    private String message;

    public GenericResponse(String message) {
        this.message = message;
    }
}

