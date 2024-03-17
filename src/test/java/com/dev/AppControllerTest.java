package com.dev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
class AppControllerTest {
    @InjectMocks
    private AppController controller;

    @Test
    void greeting() {
        String response = controller.greeting();
        Assertions.assertEquals("Hi, Hello Everyone!",
                response);
    }
}