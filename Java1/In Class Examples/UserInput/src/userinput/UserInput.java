
package userinput;
import java.util.Scanner;
public class UserInput {

   
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println( "What is your name?" );
       keyboard.nextLine();
       
       System.out.print( "What is the square root of 64?" );
        keyboard.nextInt();
        
       System.out.println( "What is half of 17?" );
       double n = keyboard.nextDouble();
       System.out.println("You entered: " + n);
       
    }
    
}
 
 