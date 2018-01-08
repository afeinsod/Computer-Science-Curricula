
package fileinput;
import java.io.*;
public class FileInput {


    public static void main(String[] args) {
        String FILENAME = "myfile.txt";
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
