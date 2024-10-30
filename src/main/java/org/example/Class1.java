package org.example;

import java.util.Random;

public class Class1 {
    static Random rand = new Random();

    public static void function1() {
        ConsoleWriter.f1(String.valueOf(rand.nextGaussian()));
    }

    public static void function2() {
        ConsoleWriter.f1(String.valueOf(rand.nextExponential()));
    }

    public static void function3() {
        ConsoleWriter.f1(String.valueOf(rand.nextDouble()));
    }
}
