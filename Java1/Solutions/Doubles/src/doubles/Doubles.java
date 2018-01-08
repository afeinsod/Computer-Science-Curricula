
package doubles;

import java.util.Scanner;

public class Doubles {

   
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int dice1=0, dice2=1;
        while (dice1 != dice2) {
            System.out.println("Want to roll the dice?");
            String answer = keyboard.nextLine();
            if (!(answer.equals("yes") || answer.equals("y"))) {
                break;
            }
            dice1 = (int )(Math.random() * 6 + 1);
            dice2 = (int )(Math.random() * 6 + 1);
            System.out.println("You rolled a " + dice1 + " and a " + dice2 + "!");
            if (dice1==dice2) {
                System.out.println("Doubles! Yay!");
            }
        }

    }
    
}
