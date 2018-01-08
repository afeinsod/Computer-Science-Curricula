
package arrays;

public class Arrays {

    public static void main(String[] args) {
        int[] array1 = new int[5];
        
        array1[0] =2;
        array1[1] =4;
        array1[2] =6;
        array1[3] =8;
        array1[4] =10;
        
        System.out.println("The element at index " + 0 + " is " + array1[0]);
        System.out.println("The element at index " + 1 + " is " + array1[1]);
        System.out.println("The element at index " + 2 + " is " + array1[2]);
        System.out.println("The element at index " + 3 + " is " + array1[3]);
        System.out.println("The element at index " + 4 + " is " + array1[4]);
        System.out.println();
        
        String[] array2 = new String[10];
        
        array2[0] ="a";
        array2[1] ="b";
        array2[2] ="c";
        array2[3] ="d";
        array2[4] ="e";
        array2[5] ="f";
        array2[6] ="g";
        array2[7] ="e";
        array2[8] ="h";
        array2[9] ="i";
        
        System.out.println("The element at index " + 0 + " is " + array2[0]);
        System.out.println("The element at index " + 1 + " is " + array2[1]);
        System.out.println("The element at index " + 2 + " is " + array2[2]);
        System.out.println("The element at index " + 3 + " is " + array2[3]);
        System.out.println("The element at index " + 4 + " is " + array2[4]);
        System.out.println("The element at index " + 5 + " is " + array2[5]);
        System.out.println("The element at index " + 6 + " is " + array2[6]);
        System.out.println("The element at index " + 7 + " is " + array2[7]);
        System.out.println("The element at index " + 8 + " is " + array2[8]);
        System.out.println("The element at index " + 9 + " is " + array2[9]);
       
        System.out.println();
        
        double[] array3 = new double[15];
        int index = 0;
        while (index<15) {
            array3[index] = index;
            System.out.print("The element at index " + index + " is " + array3[index] + ", ");
            index++;
        }
        
        System.out.println();
        System.out.println();
        
        int size = 50;
        int[] array4 = new int[size];
        index = 0;
        while (index<size) {
            array4[index] = (int) Math.pow(index,2);
            System.out.print(array4[index] + ", ");
            index++;
        }
        
        System.out.println();
        System.out.println();
        
        int[] array5 = {1,2,4,8,16};
        System.out.println(array5[2]);
        
    }
    
}
