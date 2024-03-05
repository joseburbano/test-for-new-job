package com.example.testfornewjob.configurations.challenge.domain.services;

import com.example.testfornewjob.configurations.challenge.domain.model.ChallengeDTO;

public interface ChallengeService {

    Integer calculateMaximum(ChallengeDTO challengeDTO);
}
