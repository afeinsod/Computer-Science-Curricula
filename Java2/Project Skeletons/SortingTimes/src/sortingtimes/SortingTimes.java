
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
        long startTime = System.nanoTime(); 
        bubbleSort(a);
        long bubbleSortTime = System.nanoTime() - startTime;
        startTime = System.nanoTime(); 
        selectionSort(b);
        long selectionSortTime = System.nanoTime() - startTime;
        System.out.println("Bubble Sort time: "+bubbleSortTime +", Selection Sort time: "+selectionSortTime);
    }
    
    
    //this is the main function for bubble sort
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
    //this is the helper function for bubble sort
    private static void swapNumbers(int i, int j, int[] array) {
  
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    //this is the function for selection sort
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
    
}
