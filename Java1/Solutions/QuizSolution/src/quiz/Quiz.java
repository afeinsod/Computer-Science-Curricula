
package quiz;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
        
        System.out.println("Question 2: What is the cube root of 125?");
        System.out.println("\tA) 12");
        System.out.println("\tB) 25");
        System.out.println("\tC) 5");
        System.out.println("\tD) 1000");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("C")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the cube root of 125 is 5.");
        }
        
        System.out.println("Question 3: True or False (type T or F):");
        System.out.println("\tWater consists of oxygen and hydrogen.");
        String answer3 = keyboard.nextLine();
        if (answer3.equals("T")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, this is true!");
        }
        
        System.out.println("Question 4: True or False (type T or F):");
        System.out.println("\tint n = 2.8; is a valid Java statement.");
        String answer4 = keyboard.nextLine();
        if (answer4.equals("F")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, that is false!");
        }
        
        System.out.println("Question 5: Where was Alexander Hamilton from?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) New York City");
        System.out.println("\tC) France");
        System.out.println("\tD) West Indies");
        String answer5 = keyboard.nextLine();
        if (answer5.equals("D")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, he was born in the West Indies!");
        }
        
        System.out.println("Question 6: What year was the first Pride Parade?");
        System.out.println("\tA) 1970");
        System.out.println("\tB) 1993");
        System.out.println("\tC) 1980");
        System.out.println("\tD) 2001");
        String answer6 = keyboard.nextLine();
        if (answer6.equals("A")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, it was in 1970!");
        }
        
        System.out.println("Your score is " + rightAnswers + " out of 6 questions.");
    }
    
}
