
package forloopfun;

import java.util.Scanner;

/*
 

Create an array of ints with values 1-10. You can use a for or while loop to fill it. Then, use a for loop to create a copy of the array, where all the values are changed by 2 (add 2 to each number). Create the second array before you fill it using a for loop.
Bonus: Create an array of ints with values 1-100. Use a for loop to print the numbers line by line, but print an exclamation point after multiples of 5. Use an if statement and the math concept of mod:
*/
public class ForLoopFun {

    public static void main(String[] args) {
        for (int i = 0; i<10; i++) {
            System.out.println("I love Java");
        }
        
        
        System.out.println();

        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number to count to:");
        int count = Integer.parseInt(keyboard.nextLine());
        for (int i =0; i<= count; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
         
        
        System.out.println();

        
        System.out.println("Please enter a number to start from:");
        int start = Integer.parseInt(keyboard.nextLine());
        System.out.println("Please enter a number to end at:");
        int end = Integer.parseInt(keyboard.nextLine());
        System.out.println("Please enter a number to count by:");
        int countBy = Integer.parseInt(keyboard.nextLine());
        for (int j =start; j<= end; j+=countBy) {
            System.out.print(j + " ");
        }
        System.out.println();
        
        
        System.out.println();
        
        
        int[] array1 = new int[10];
        for (int i = 0; i<10; i++) {
            array1[i] = i;
        }
        int[] array2 = new int[10];
        System.out.println("Second array: ");
        for (int i = 0; i<10; i++) {
            array2[i] = array1[i] + 2;
            System.out.println(array2[i] + " ");
        }
        
        System.out.println();

        System.out.println("Bonus!");
        int[] array3 = new int[100];
        for (int i =0; i<100; i++) {
            array3[i] = i;
            System.out.print(array3[i]);
            if ((i % 5) == 0) {
                System.out.print("!");
            }
            System.out.println();
        }
        
        System.out.println();

    }
    
}
