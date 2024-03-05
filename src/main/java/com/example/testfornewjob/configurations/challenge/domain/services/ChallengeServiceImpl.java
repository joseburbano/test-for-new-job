package com.example.testfornewjob.configurations.challenge.domain.services;

import com.example.testfornewjob.configurations.challenge.domain.model.ChallengeDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ChallengeServiceImpl implements ChallengeService {

    @Override
    public Integer calculateMaximum(ChallengeDTO challengeDTO) {
        log.info("Recalculation {} ", challengeDTO);

        // Calculate the maximum integer k satisfying k % x == y
        return (challengeDTO.getN() - challengeDTO.getY()) / challengeDTO.getX() * challengeDTO.getX() + challengeDTO.getY();
    }

}
