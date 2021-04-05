package net.tilialacus.lightsout;

public class Board {

    public static boolean completed(long state) {
        return (state & 0x1FFFFFF) == 0;
    }
}
