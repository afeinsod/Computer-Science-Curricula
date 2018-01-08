package queue;

import java.util.Scanner;

/**
 *
 * @author Alix
 */
public class App {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean playing = true; 
        Market m = new Market();
        System.out.println("Welcome to the stock market. ");
        while (playing) {
            System.out.println("Write 'buy' to buy shares.");
            System.out.println("Write 'sell' to sell shares.");
            System.out.println("Write 'gains' to see your total gains.");
            System.out.println("Write 'q' to exit.");
            String input = keyboard.nextLine();
            if (input.equals("buy")) {
                System.out.println("How many shares are you buying?");
            int numShares = Integer.parseInt(keyboard.nextLine());
            System.out.println("At what price are you buying?");
            double price = Double.parseDouble(keyboard.nextLine());
            m.buyShares(numShares, price);
            }
            else if (input.equals("sell")) {
                System.out.println("How many shares are you selling?");
            int numShares = Integer.parseInt(keyboard.nextLine());
            System.out.println("At what price are you selling?");
            double price = Double.parseDouble(keyboard.nextLine());
            m.sellShares(numShares, price);
            }
            else if (input.equals("gains")) {
                System.out.println(m.getGains());
            }
            else {
                playing=false;
            }
            
        }
        System.out.println("Goodbye!");
    }
}
