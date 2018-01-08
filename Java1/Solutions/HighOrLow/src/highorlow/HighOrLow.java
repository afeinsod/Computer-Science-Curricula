
package highorlow;

import java.util.Scanner;

public class HighOrLow {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int secretNum=(int )(Math.random() * 100 + 1);
        int guess=0;
        int count = 0;
        System.out.println("I'm thinking of a number between 1 and 100. Make a guess!");
        while (guess != secretNum) {
            System.out.println("What's your guess?");
            String answer = keyboard.nextLine();
            guess = Integer.parseInt(answer);
            if (guess<secretNum) {
                System.out.println("Too low!");
            }
            if (guess>secretNum) {
                System.out.println("Too high!");
            }
            count ++;
        }
        System.out.println("You got it! Great job!");
        System.out.println("You took " + count + " tries to guess my number.");
    }
    
}

