package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.print.DocFlavor;
import java.util.Scanner;
@RestController
public class MainController {

    @RequestMapping("/")
    public String showIndex() {
        String outputString = " ";
        Integer multiplesCount = 0;
        Scanner rangeInput = new Scanner(System.in);
        System.out.println("Please Input your desired range.");
        int range = rangeInput.nextInt();
        for (int n = 1; n <= range; n++) {
            outputString = outputString + " ";
            if (n % 7 == 0 || n % 17 == 0 || n % 23 == 0) {
                multiplesCount++;
            }if (n % 3 == 0) {
                outputString = outputString + "Fizz";
            }if (n % 5 == 0) {
                outputString = outputString + "Buzz";
            }if (n % 3 != 0 && n % 5 != 0 ) {
                outputString = outputString + n;
            }
        }
        return (outputString + "And there are " + multiplesCount + " multiples of 7, 17, and 23.");
    }
}
