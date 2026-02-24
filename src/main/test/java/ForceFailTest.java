package com.example.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ForceFailTest {

    @Test
    void failTest() {
        fail("Deliberate red test for UAT"); // This will always fail
    }
}