package com.example.testfornewjob.common.dto;

import lombok.*;

@Data
@Builder
public class ResponseDTO {
    private boolean successful;
    private Object data;
    private String message;
    private String title;
    private Integer code;
}
