
package mathio;
import java.io.*;
public class MathIO {

   
    public static void main(String[] args) {
        
        
        String FILENAME = "numbers.txt";
        
        //Part 1
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            
            String line1 = "2\n";
            String line2 = "4\n";
            String line3 = "6\n";
            String line4 = "8\n";
            String line5 = "10\n";

            writer.write(line1);
            writer.write(line2);
            writer.write(line3);
            writer.write(line4);
            writer.write(line5);
            System.out.println("Done");

	} 
        catch (IOException e) {
            e.printStackTrace();

	}
        
        //Part 2
    
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();

            double total = 0;
            
            while (currentLine != null) {
                total+=Double.parseDouble(currentLine);
		System.out.println(currentLine);
                currentLine = reader.readLine();
            }
            System.out.println("Sum of all numbers entered: " + total);

	}
        catch (IOException e) {
            e.printStackTrace();
	}
    }
    
}
