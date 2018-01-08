
package conditionals2;

import java.util.Scanner;


public class Conditionals2 {
 public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;    
        
        System.out.print( "How old are you? " );
        age = Integer.parseInt(keyboard.nextLine());
        
        if (age < 3) {
            System.out.println("You're a baby!");
        }
        else {
            System.out.println("You are not a baby.");
        }
        
        int height; 
        System.out.print( "How many feet tall are you? " );
        height = Integer.parseInt(keyboard.nextLine());
        
        if (height >6 ) {
            System.out.println("Do you play basketball?");
        }
        else {
            System.out.println("You probably don't play basketball...");
        }
        
        String answer; 
        System.out.print( "Please type the word lion: " );
        answer = keyboard.nextLine();
        
        if (answer.equals("lion") ) {
            System.out.println("Thank you!");
        }
        else {
            System.out.println("You don't follow directions very well...");
        }
 }
}
