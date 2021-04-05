package net.tilialacus.lightsout;

public class Board {

    public static final long LIGHTS_OUT = 0b00000_00000_00000_00000_00000L;
    public static final int SIZE = 5;
    public static final long MASK = (1 << SIZE * SIZE) - 1;

    public static boolean completed(long state) {
        return (state & MASK) == 0;
    }

    public static long toggle(long state, int x, int y) {
        state = state ^ (1 << (x + y * SIZE));
        if (y > 0) {
            state = state ^ (1 << (x + (y - 1) * SIZE));
        }
        if (y < 4) {
            state = state ^ (1 << (x + (y + 1) * SIZE));
        }
        if (x > 0) {
            state = state ^ (1 << ((x - 1) + y * SIZE));
        }
        if (x < 4) {
            state = state ^ (1 << ((x + 1) + y * SIZE));
        }
        return state;
    }
}
