
package sortingtimes;




public class SortingTimes {

    
    public static void main(String[] args) {
        int[] a = new int[50];
        for (int i =0; i<50; i++) {
            a[i]=(int) (Math.random()*1000);
        }
        int[] b =new int[50];
        for (int i =0; i<50; i++) {
            b[i]=a[i];
        }
        int[]c=new int[50];
        for (int i =0; i<50; i++) {
            c[i]=a[i];
        }
        long startTime = System.nanoTime(); 
        bubbleSort(a);
        long bubbleSortTime = System.nanoTime() - startTime;
        startTime = System.nanoTime(); 
        selectionSort(b);
        long selectionSortTime = System.nanoTime() - startTime;
        startTime = System.nanoTime(); 
        insertionSort(c);
        long insertionSortTime = System.nanoTime() - startTime;
        System.out.println("Integers: Bubble Sort time: "+bubbleSortTime +", Selection Sort time: "+selectionSortTime+", Insertion sort time: "+insertionSortTime);
    
        
        
        
        //STRINGS
        
        String[] s = new String[16];
        s[0]="A"; s[1]="bunch"; s[2]="of"; s[3]="revolutionary"; 
        s[4]="manumission"; s[5]="abolitionists"; s[6]="give"; s[7]="me"; 
        s[8]="your"; s[9]="position"; s[10]="show"; s[11]="me"; 
        s[12]="where"; s[13]="the"; s[14]="ammunition"; s[15]="is";
        String[] t =new String[16];
        for (int i =0; i<16; i++) {
            t[i]=s[i];
        }
        String[] u=new String[16];
        for (int i =0; i<16; i++) {
            u[i]=s[i];
        }
        startTime = System.nanoTime(); 
        bubbleSort(s);
        long stringBubbleSortTime = System.nanoTime() - startTime;
        startTime = System.nanoTime(); 
        selectionSort(t);
        long stringSelectionSortTime = System.nanoTime() - startTime;
        startTime = System.nanoTime(); 
        insertionSort(u);
        long stringInsertionSortTime = System.nanoTime() - startTime;
        System.out.println("Strings: Bubble Sort time: "+stringBubbleSortTime +", Selection Sort time: "+stringSelectionSortTime+", Insertion sort time: "+stringInsertionSortTime);
    
    }
    
    
    //this is the main function for bubble sort for integers
    public static void bubbleSort(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
           
        }
    }
    //this is the helper function for bubble sort for integers
    private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    //this is the function for selection sort for integers
    public static void selectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
    
     //this is the main function for bubble sort for Strings
    public static void bubbleSort(String array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i].compareTo(array[k]) >0) {
                    swapNumbers(i, k, array);
                }
            }
           
        }
    }
    //this is the helper function for bubble sort for Strings
    private static void swapNumbers(int i, int j, String[] array) {
  
        String temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    //this is the function for selection sort for Strings
    public static void selectionSort(String[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j].compareTo(arr[index])>0) 
                    index = j;
      
            String smallerWord = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerWord;
        }
    }
    
    //this is the function for insertion sort with ints
     public static void insertionSort(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
    }
    
     //this is the function for insertion sort with Strings
     public static void insertionSort(String[] input){
         
        String temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j].compareTo(input[j-1])>0){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
    }
}
