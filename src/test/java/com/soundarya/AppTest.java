
package com.soundarya;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {
        App app = new App();

        assertEquals(30, app.add(10, 20));
    }

    @Test
    public void testGreeting() {
        App app = new App();

        assertEquals("Hello Soundarya", app.greet("Soundarya"));
    }

    @Test
    public void testMain() {
        App.main(new String[]{});
    }
}


