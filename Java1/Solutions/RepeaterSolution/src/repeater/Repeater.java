
package repeater;

import java.util.Scanner;

public class Repeater {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.print( "Type something, and I will repeat it: " );
       String input = keyboard.nextLine();
       System.out.print( "How many times should I repeat it? " );
       int total = Integer.parseInt(keyboard.nextLine());
       
       System.out.println("Here we go!");
       int count = 1;
       while (count <= total) {
           System.out.println(count + ". " + input);
           count ++;
       }
    }
    
}
