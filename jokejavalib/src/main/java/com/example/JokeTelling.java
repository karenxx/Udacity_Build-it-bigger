package com.example;

import java.util.Random;

public class JokeTelling {
    private String[] jokes;
    private Random random;

    public JokeTelling() {
        jokes = new String[5];
        jokes[0] = "Can a kangaroo jump higher than a house? Of course, a house doesn’t jump at all.";
        jokes[1] = "It is so cold outside I saw a politician with his hands in his own pockets.";
        jokes[2] = "I wanted to grow my own food but I couldn’t get bacon seeds anywhere.";
        jokes[3] = "I can’t believe I forgot to go to the gym today. That’s 7 years in a row now.";
        jokes[4] = "One state official to the other: \"I don't know what people have against us - We haven't done anything.";

        random = new Random();
    }

    public String getRandomJoke() {
        return jokes[random.nextInt(jokes.length)];
    }

}
