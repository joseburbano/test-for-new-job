package com.example.testfornewjob.configurations.challenge.domain.services;

import static org.junit.jupiter.api.Assertions.*;

import com.example.testfornewjob.configurations.challenge.domain.model.ChallengeDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ChallengeServiceImplTest {


    @Mock
    private final ChallengeService challengeService;

    ChallengeServiceImplTest(ChallengeService challengeService) {
        this.challengeService = challengeService;
    }

    @Test
    @DisplayName("Calculate Maximum")
    void testCalculateMaximum() {
        // Test case 1: x=7, y=5, n=12345
        ChallengeDTO testCase1 = new ChallengeDTO(7, 5, 12345);
        assertEquals(12339, challengeService.calculateMaximum(testCase1));

        // Test case  2: x=5, y=0, n=4
        ChallengeDTO testCase2 = new ChallengeDTO(5, 0, 4);
        assertEquals(0, challengeService.calculateMaximum(testCase2));

        // Test case  3: x=10, y=5, n=15
        ChallengeDTO testCase3 = new ChallengeDTO(10, 5, 15);
        assertEquals(15, challengeService.calculateMaximum(testCase3));
    }
}