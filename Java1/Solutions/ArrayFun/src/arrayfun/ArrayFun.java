/*


Create another array of integers with size 1000. Fill it with random numbers between 1 and 1000. Use a while loop! Use the length of the array for the while condition. Then, print all the numbers out in a list, making them go to a new line every 20 numbers. You can use a double while loop to do that!

 */
package arrayfun;

public class ArrayFun {

    public static void main(String[] args) {
       int[] array1 = new int[10];
       
        array1[0] =1;
        array1[1] =3;
        array1[2] =5;
        array1[3] =7;
        array1[4] =9;
        array1[5] =11;
        array1[6] =13;
        array1[7] =15;
        array1[8] =17;
        array1[9] =19;
        
        System.out.println("The element at index " + 0 + " is " + array1[0]);
        System.out.println("The element at index " + 1 + " is " + array1[1]);
        System.out.println("The element at index " + 2 + " is " + array1[2]);
        System.out.println("The element at index " + 3 + " is " + array1[3]);
        System.out.println("The element at index " + 4 + " is " + array1[4]);
        System.out.println("The element at index " + 5 + " is " + array1[5]);
        System.out.println("The element at index " + 6 + " is " + array1[6]);
        System.out.println("The element at index " + 7 + " is " + array1[7]);
        System.out.println("The element at index " + 8 + " is " + array1[8]);
        System.out.println("The element at index " + 9 + " is " + array1[9]);
        
        System.out.println();
        
        double[] array2 = new double[10];
        int index = 0;
        while (index<array2.length) {
            array2[index] = 1.25;
            System.out.println("The element at index " + index + " is " + array2[index]);
            index++;
        }
        
        System.out.println();
        
        int[] array3 = new int[1000];
        index = 0;
        while (index<array3.length) {
            array3[index] = (int) (Math.random()*1000 + 1);
            index++;
        }
        index=0;
        int index2=0;
        int index3=0;
        while (index3<50) {
            while(index2<20) {
                System.out.print(array3[index] + " ");
                index ++;
                index2++;
            }
            System.out.print("\n");
            index2=0;
            index3++;
        }
        System.out.println();
    }
    
}
