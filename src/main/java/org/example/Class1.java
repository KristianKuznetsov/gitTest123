package org.example;

import java.util.Random;

public class Class1 {
    static Random rand = new Random();

    public static void function1() {
        ConsoleWriter.f1(String.valueOf(rand.nextGaussian()));
    }

    
}
