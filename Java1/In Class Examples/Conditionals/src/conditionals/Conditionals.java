
package conditionals;
import java.util.Scanner;
public class Conditionals {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int age; 
        System.out.print( "How old are you? " );
        age = keyboard.nextInt();
        
        if (age < 3) {
            System.out.println("You're a baby!");
        }
        
        if (age >= 10) {
            System.out.println("Congrats! You hit double digits!");
        }
        
        if (age == 16) {
            System.out.println("You are 16, going on 17...");
        }
    }
    
}