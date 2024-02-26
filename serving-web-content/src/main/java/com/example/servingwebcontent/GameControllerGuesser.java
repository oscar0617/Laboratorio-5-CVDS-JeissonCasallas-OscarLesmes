package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import java.util.Random;

@Controller
public class GameControllerGuesser {
    private int winnerNum;
    private int actualPrice = 100000;

    @GetMapping("/guess")
    public String gameModel(Model model){
        Random random = new Random();
        winnerNum = random.nextInt(10) + 1;
        model.addAttribute("actualValue", "Premio: " + actualPrice);
        return "guess";
    }

    @PostMapping("/guess")
    public String play(int number, Model model){
        if(number == winnerNum){
            model.addAttribute("winnerAlert", "Felicitaciones! El premio es: " + actualPrice);
        }
        else{
            actualPrice -= 10000;   
        }
        model.addAttribute("actualValue", "Premio: " + actualPrice);
        return "guess";
    }

    @PostMapping("/reset")
    public String reset(){
        actualPrice = 100000;
        return "redirect:/guess";
    }

}
