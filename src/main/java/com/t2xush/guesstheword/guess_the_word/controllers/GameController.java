package com.t2xush.guesstheword.guess_the_word.controllers;

import com.t2xush.guesstheword.guess_the_word.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GameController {

    @Autowired
    GameService gameService;
    @GetMapping("/game-home")
    public String showGameHomePage(@RequestParam(value="guessedChar",required = false) String guessedChar,Model model){

        System.out.println("guessedchar is "+guessedChar);
        String randomWord = gameService.toString();


          if(guessedChar !=null) {
              gameService.addGuess(guessedChar.charAt(0));
              randomWord=gameService.toString();
          }
        model.addAttribute("wordToDisplay",randomWord);

        return "game-home-page";
    }
}
