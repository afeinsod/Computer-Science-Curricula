
package puzzles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Puzzles {

    public static void main(String[] args) {
        String FILENAME = "puzzle.txt";
	try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();

            while (currentLine != null) {
		System.out.println(currentLine);
                currentLine = reader.readLine();
            }

	}
        catch (IOException e) {
            e.printStackTrace();
	}
    }
    
}
