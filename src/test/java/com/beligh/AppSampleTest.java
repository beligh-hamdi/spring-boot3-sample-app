package com.beligh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppSampleTest {

    @Test
    void testAppConstructor() {
        AppSample app1 = new AppSample();
        AppSample app2 = new AppSample();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    void testAppMessage() {
        AppSample app = new AppSample();
        assertEquals("Hello World!", app.getMessage());
    }

}