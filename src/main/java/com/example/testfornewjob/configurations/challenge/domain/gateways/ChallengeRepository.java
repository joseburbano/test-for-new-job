package com.example.testfornewjob.configurations.challenge.domain.gateways;


import com.example.testfornewjob.configurations.challenge.domain.model.ChallengeDTO;


public interface ChallengeRepository {

    Integer maximumRequest(ChallengeDTO challengeDTO);
}
