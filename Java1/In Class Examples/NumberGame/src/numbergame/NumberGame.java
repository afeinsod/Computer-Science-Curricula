
package numbergame;

import java.util.Scanner;


public class NumberGame {

   
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       int n = (int) (Math.random() *5) + 1;
       System.out.println( "I'm thinking of a number between 1 and 5. What is it?" );
       int guess = Integer.parseInt(keyboard.nextLine());
       if (guess==n) {
            System.out.println("You got it!");
       }
       else {
            System.out.println("Nope! I was thinking of " + n + ".");
       }
    
    }
    
}
