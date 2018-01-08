
package hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 It must randomly choose a word from a list of words, stop when all the letters in the word are guessed.
It must give them limited tries and stop after they run out. 
It must display the letters they have already guessed.
 */
public class Hangman {

    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        String FILENAME = "words.txt";
	try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();

            while (currentLine != null) {
                l.add(currentLine);
                currentLine = reader.readLine();
            }

	}
        catch (IOException e) {
            e.printStackTrace();
	}
        
        int i = (int) (Math.random() *l.size()) + 1;
        String word = (String) l.get(i);
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println(word);
        
        boolean won = false;
        int max=15;
        int guesses=0;
        ArrayList<Character> letters= new ArrayList();
        ArrayList<Character> guessed = new ArrayList();
        ArrayList<Character> wrong = new ArrayList();
        for (char c : word.toCharArray()) {
            letters.add(c);
        }
        while ((!won && (guesses<=max))) {
            System.out.println("You have " + (max-guesses) + " more guesses.");
            for (char c: letters) {
                if (guessed.contains(c)) {
                    System.out.print(c);
                }
                else{ 
                    System.out.print("-");
                }
            }
            System.out.println();
            System.out.print("Wrong guesses: ");
            for (char c: wrong) {
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.println("What is your guess?");
            char guess = keyboard.nextLine().charAt(0);
            if (letters.contains(guess)) {
                System.out.println("Yes, you got a letter!");
                if (!guessed.contains(guess)) {
                    guessed.add(guess);
                }
                if (guessed.size() == letters.size() ){
                    won=true;
                }
            }
            else{
                System.out.println("Another guess down, bummer!");
                wrong.add(guess);
            }
            System.out.println();
            System.out.println();
            guesses ++;
        }
    }
    
}
