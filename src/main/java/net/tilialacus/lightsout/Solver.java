package net.tilialacus.lightsout;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solver {

    public static long[] getSolutions() {
        long[] states = new long[1 << (Board.SIZE * Board.SIZE + 1) - 1];
        for (long state = 0; state < states.length; state ++) {
            states[(int) state] = -1;
        }
        Queue<Long> queue = new ArrayDeque<Long>();
        queue.add(0L);
        while (!queue.isEmpty()) {
            long index = queue.remove();
            for (int x = 0; x < 5; x++) {
                for (int y = 0; y < 5; y++) {
                    long state = Board.toggle(index, x, y);
                    if (states[(int) state] == -1) {
                        states[(int) state] = index;
                        queue.add(state);
                    }
                }
            }
        }
        return states;
    }
}
