package net.tilialacus.lightsout;

import java.util.Arrays;

public class LightsOut {

    public static void main(String[] args) {
        System.err.println("Possible states " + Arrays.stream(Solver.getSolutions()).filter(it -> it > -1).count());
    }
}
