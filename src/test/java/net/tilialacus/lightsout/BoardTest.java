package net.tilialacus.lightsout;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    @Test
    void lightsOut() {
        assertAll(
                () -> assertTrue(Board.completed(0)),
                () -> assertTrue(Board.completed(1<<25))
        );
    }

    @Test
    void remainingLights() {
        assertAll(
                () -> assertFalse(Board.completed(1)),
                () -> assertFalse(Board.completed(100)),
                () -> assertFalse(Board.completed(298756))
        );
    }
}