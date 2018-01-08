
package hatshop;

import java.util.Scanner;

public class HatShop {
    /*Add a hat to cart, see your cart, remove hats from the order, and check out (which should end the program). 
    These 4 options should call 4 different functions. 
    The program should keep track of how many hats are in the order at any time.*/
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Hat Shop!");
        checkout=false;
        numHats=0;
        while (checkout == false) {
            System.out.println("What can I do for you?");
            System.out.println("Type 1 to add a hat to your order");
            System.out.println("Type 2 to remove a hat from your order");
            System.out.println("Type 3 to view your order");
            System.out.println("Type 4 to check out (quit)");
            int choice = Integer.parseInt(keyboard.nextLine());
            if (choice == 1) {
                addHat();
            }
            else if (choice ==2) {
                removeHat();
            }
            else if (choice == 3) {
                viewOrder();
            }
            else if (choice ==4) {
                checkOut();
            }
            else {
                System.out.println("Invalid option!");
            }
        }
    }
    static boolean checkout;
    static int numHats;
    public static void addHat() {
        numHats++;
        System.out.println();
        System.out.println();
    }
    public static void removeHat() {
        if (numHats >= 1) {
            numHats--;
        }
        else {
            System.out.println("There are no hats left to remove!");
        }
        System.out.println();
        System.out.println();
    }
    public static void viewOrder() {
        System.out.println("You have " + numHats + " hats in your cart.");
    }
    public static void checkOut() {
        checkout=true;
        System.out.println("You bought " + numHats + " hats! Thank you!");
        System.out.println();
        System.out.println();
    }
}
