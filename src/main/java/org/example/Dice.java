package org.example;

import java.util.Random;

public class Dice {
    private final Random random = new Random();

    public int roll(int faces){
        if(faces <= 0) throw new IllegalArgumentException("O dado deve ter pelo menos 1 face");
        return  this.random.nextInt(faces)+1;
    }
}
