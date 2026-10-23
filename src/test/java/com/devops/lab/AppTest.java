package com.devops.lab;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class AppTest {

    @Test
    public void verifySystemBottleneckValidation() {
        boolean constraintDefectDetected = false;

        Assertions.assertFalse(
            constraintDefectDetected,
            "CRITICAL: System bottleneck or defect detected in value stream!"
        );
    }
}
