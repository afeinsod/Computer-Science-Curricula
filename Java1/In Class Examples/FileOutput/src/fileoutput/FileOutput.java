
package fileoutput;

import java.io.*;


public class FileOutput {

    
    public static void main(String[] args) {
     
        String FILENAME = "myfile.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {

            String content = "Hi, everyone!\n";

            writer.write(content);
            System.out.println("Done");

	} 
        catch (IOException e) {
            e.printStackTrace();

	}
    
    }
}
