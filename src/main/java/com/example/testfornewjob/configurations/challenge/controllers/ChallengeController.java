package com.example.testfornewjob.configurations.challenge.controllers;

import com.example.testfornewjob.common.controller.AbstractRestController;
import com.example.testfornewjob.common.dto.ResponseDTO;
import com.example.testfornewjob.configurations.challenge.domain.model.ChallengeDTO;
import com.example.testfornewjob.configurations.challenge.domain.services.ChallengeService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/v1/challenge")
@AllArgsConstructor
public class ChallengeController extends AbstractRestController {
    private final ChallengeService challengeService;

    @GetMapping(value = "/ping")
    public ResponseEntity<Object> ping() {
        return new ResponseEntity<>("pong", HttpStatus.OK);
    }


    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<ResponseDTO> maximumRequestPost(@Valid @RequestBody ChallengeDTO challengeDTO) {

        ResponseDTO responseDTO = buildSuccessResponseDTO(challengeService.calculateMaximum(challengeDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<ResponseDTO> maximumRequestGet(@RequestParam("x") Integer x,
                                                         @RequestParam("y") Integer y,
                                                         @RequestParam("n") Integer n) {
        ChallengeDTO challengeDTO = new ChallengeDTO(x, y, n);
        ResponseDTO responseDTO = buildSuccessResponseDTO(challengeService.calculateMaximum(challengeDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

}


