package net.tilialacus.lightsout;

public class Board {

    public static final long LIGHTS_OUT = 0b00000_00000_00000_00000_00000L;

    public static boolean completed(long state) {
        return (state & 0x1FFFFFF) == 0;
    }

    public static long toggle(long state, int x, int y) {
        state = state ^ (1 << (x + y * 5));
        if (y > 0) {
            state = state ^ (1 << (x + (y - 1) * 5));
        }
        if (y < 4) {
            state = state ^ (1 << (x + (y + 1) * 5));
        }
        if (x > 0) {
            state = state ^ (1 << ((x - 1) + y * 5));
        }
        if (x < 4) {
            state = state ^ (1 << ((x + 1) + y * 5));
        }
        return state;
    }
}
