package com.t2xush.guesstheword.guess_the_word.service;

import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

@Service
public class GameService {

    private String[] randomWords={"mother","father","sister","string","hello","lunch","evening","country"};
    Random random=new Random();


    @Override
    public String toString() {
        System.out.println(randomWords.length);
        return randomWords[random.nextInt(randomWords.length)];
    }
}
