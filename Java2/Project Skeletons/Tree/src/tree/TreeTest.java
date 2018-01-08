
package tree;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alix
 */
public class TreeTest {

    public static void main(String[] args) throws IOException {
       Scanner scan = new Scanner (new File("words.txt"));
        Tree tree = new Tree();
        for (int linenr = 1; scan.hasNextLine (); ++linenr) {
            for (String word: scan.nextLine().split ("\\W+")) {
                tree.insert(word, linenr);
            }
        }
        scan.close();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like debug mode on?");
        String debug = keyboard.nextLine();
        if (debug.equals("yes")) {
            tree.debug();
        } else {
            tree.output();
}
    }
    
}
