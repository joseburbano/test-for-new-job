package com.example.testfornewjob.common.controller;
import com.example.testfornewjob.common.dto.ResponseDTO;

/**
 * Abstract class that implements general controller functionalities.
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
