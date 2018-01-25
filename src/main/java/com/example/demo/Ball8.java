package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;
import java.util.Random;
@RestController

public class Ball8 {
    @RequestMapping("8ball")
    public String ball8() {
        boolean repeat = true;
        Scanner ballQuestion = new Scanner(System.in);
        Random responseGet = new Random();
        do {
            System.out.println("What is it, that you wish to ask of this magic orb?");
            String question = ballQuestion.nextLine();
            int responseN = responseGet.nextInt(20);

            //Get response from list somehow

            System.out.println("Your question was: " + question);
            System.out.println("This is a placeholder for randomized responses");

            System.out.println("Now that you've seen my magic, do you have another question? (Y/N)");
            String YesNo = ballQuestion.nextLine();
            if (YesNo.equalsIgnoreCase("y")) {
                repeat = true;
            } else {
                repeat = false;
            }
        }while (repeat == true);
        return null;
        }
}













/*"It is certain"
"It is decidedly so"
"Without a doubt"
"Yes definitely"
"You may rely on it"
"As I see it, yes"
"Most likely"
"Outlook good"
"Yes"
"Signs point to yes"
"Reply hazy try again"
"Ask again later"
"Better not tell you now"
"Cannot predict now"
"Concentrate and ask again"
"Don't count on it"
"My reply is no"
"My sources say no"
"Outlook not so good"
"Very doubtful"} */
