package com.t2xush.guesstheword.guess_the_word.service;

import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

@Service
public class GameService {
private String randomlyChosenWord= null;
    private String[] randomWords={"mother","sister","hello","lunch","evening","country","okay"};

   private char[] allCharactersOfTheWord;
    Random random=new Random();

    public GameService() {
randomlyChosenWord=randomWords[random.nextInt(randomWords.length)];
        System.out.println("randomly chosen word is: "+randomlyChosenWord);
allCharactersOfTheWord=new char[randomlyChosenWord.length()];
    }

    @Override
    public String toString() {

        String ret="";

       for (char c:allCharactersOfTheWord){
           if(c=='\u0000'){
               ret=ret+"_";
           }
           ret=ret+" ";
       }
        return ret;
    }
}

