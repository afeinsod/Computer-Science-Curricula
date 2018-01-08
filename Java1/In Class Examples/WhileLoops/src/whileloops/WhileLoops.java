
package whileloops;

import java.util.Scanner;

public class WhileLoops {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String password = "Abracadabra";
        String user = "";
        while(!user.equals(password)) {
            System.out.println( "What's the magic word?" );
            user = keyboard.nextLine();
        }
        
         System.out.println( "Correct!" );
         
         System.out.println( "Next example:");
       
         int i=0;
         
         while (i<5) {
             System.out.print( "My name is Alix! " );
             System.out.println(i);
             i++;
         }
         
         System.out.println( "Last example:");
       
         i=0;
         int sum=0;
         while (i<10) {
             sum += i;
             System.out.println("Sum is: " + sum);
             i++;
         }
    }
    
}
