package com.example;

import java.util.Random;

public class JokeTelling {
    private String[] jokes;
    private Random random;

    public JokeTelling() {
        jokes = new String[4];
        jokes[0]="1";
        jokes[1] = "2";
        jokes[2] = "3";
        jokes[3] = "4";

        random = new Random();
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}
