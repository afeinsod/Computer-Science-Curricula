
package conditionals3;

import java.util.Scanner;

public class Conditionals3 {

   
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age;    
        
        System.out.print( "How old are you? " );
        age = Integer.parseInt(keyboard.nextLine());
        
        if (age < 3) {
            System.out.println("You're a baby!");
        }
        else if (age < 11) {
            System.out.println("You're probably in Elementary School.");
        }
        else if (age < 13) {
            System.out.println("Middle school!");
        }
        else if (age < 20) {
            System.out.println("You're a teenager!");
        }
        else if (age < 35) {
            System.out.println("You're an adult, but too young to run for President. Bummer!");
        }
        else if (age < 65) {
            System.out.println("Do you ever really feel like an adult?");
        }
        else {
            System.out.println("Enjoy retirement!");
        }
        
    }
    
}
