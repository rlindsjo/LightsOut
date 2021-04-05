package net.tilialacus.lightsout;

import org.junit.jupiter.api.Test;

import static net.tilialacus.lightsout.Board.LIGHTS_OUT;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void toggle() {
        assertAll(
                () -> assertEquals(0b00000_00100_01110_00100_00000L, Board.toggle(LIGHTS_OUT, 2, 2)),

                () -> assertEquals(0b00000_00000_00000_00001_00011L, Board.toggle(LIGHTS_OUT, 0, 0)),
                () -> assertEquals(0b00011_00001_00000_00000_00000L, Board.toggle(LIGHTS_OUT, 0, 4)),
                () -> assertEquals(0b11000_10000_00000_00000_00000L, Board.toggle(LIGHTS_OUT, 4, 4)),
                () -> assertEquals(0b00000_00000_00000_10000_11000L, Board.toggle(LIGHTS_OUT, 4, 0)),

                () -> assertEquals(0b00000_00000_00000_00100_01110L, Board.toggle(LIGHTS_OUT, 2, 0)),
                () -> assertEquals(0b00000_00001_00011_00001_00000L, Board.toggle(LIGHTS_OUT, 0, 2)),
                () -> assertEquals(0b00000_10000_11000_10000_00000L, Board.toggle(LIGHTS_OUT, 4, 2)),
                () -> assertEquals(0b01110_00100_00000_00000_00000L, Board.toggle(LIGHTS_OUT, 2, 4)),

                () -> assertEquals(LIGHTS_OUT, Board.toggle(0b00000_00100_01110_00100_00000L, 2, 2))
        );
    }
}