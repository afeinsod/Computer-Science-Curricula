
package mathio;
import java.io.*;
public class MathIO {

   
    public static void main(String[] args) {
        
        
        String FILENAME = "numbers.txt";
        
        //Part 1
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            //here is where you should put your numbers
            String line1 = "";

            //here is where you should write your numbers to the file
            writer.write(line1);
            System.out.println("Done");

	} 
        catch (IOException e) {
            e.printStackTrace();

	}
        
        //Part 2
    
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
