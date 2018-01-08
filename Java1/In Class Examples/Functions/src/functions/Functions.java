
package functions;
import java.util.Scanner;
public class Functions {
Scanner keyboard = new Scanner(System.in);
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int choice;

		System.out.println( "1. Say Hello" );
		System.out.println( "2. Tell a Joke" );
		System.out.println( "3. Add 2 numbers together" );
		System.out.println( "4. Play the High-Low Game" );

		System.out.print( "\nWhat do you want to do? " );
		choice = Integer.parseInt(keyboard.nextLine());
		System.out.println();

		if ( choice == 1 ) {
			sayHello();
		}
		else if ( choice == 2 ) {
			tellJoke();
		}
		else if ( choice == 3 ) {
                         System.out.println( "What numbers do you want to add?" );   
                         System.out.print( "First number:" );
                        double num1 = Double.parseDouble(keyboard.nextLine());
                        System.out.print( "Second number:" );
                        double num2 = Double.parseDouble(keyboard.nextLine());
			 System.out.print( "Sum = " + addNums(num1, num2) );
		}
		else if ( choice == 4 ) {
			 highLow();
		}
		else {
			System.out.println( "Sorry, that wasn't one of the choices." );
		}

		System.out.println( "\nBye!" );
	}

	public static void sayHello() {
		System.out.println("Hello, there! How are you today?");
	}

	public static void tellJoke() {
		System.out.println("Today someone knocked on my door and asked for a small donation towards the local swimming pool. I gave them a glass of water. ");
	}

	public static double addNums(double n1, double n2) {
		return n1+n2;
	}

	public static void highLow() {
            Scanner keyboard = new Scanner(System.in);
            int secretNum=(int )(Math.random() * 100 + 1);
            int guess=0;
            int count = 0;
            System.out.println("I'm thinking of a number between 1 and 100. Make a guess!");
            while (guess != secretNum) {
                System.out.println("What's your guess?");
                String answer = keyboard.nextLine();
                guess = Integer.parseInt(answer);
                if (guess<secretNum) {
                    System.out.println("Too low!");
                }
                if (guess>secretNum) {
                    System.out.println("Too high!");
                }
                count ++;
            }
            System.out.println("You got it! Great job!");
            System.out.println("You took " + count + " tries to guess my number.");
	}
}
