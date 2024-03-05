package com.example.testfornewjob.common.controller;
import com.example.testfornewjob.common.dto.ResponseDTO;

/**
 * Clase abstracta que implementa funcionalidades generales de los controladores
 */
public abstract class AbstractRestController {

    protected ResponseDTO buildSuccessResponseDTO(Object result) {
        return ResponseDTO.builder()
                .successful(true)
                .data(result)
                .message("OK")
                .title("Successful")
                .code(200)
                .build();
    }
}
