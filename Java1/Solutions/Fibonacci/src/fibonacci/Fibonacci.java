
package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        int f1=1, f2=2,f3=0;
        int sum = f2;
        while(f3<4000000) {
            f3=f1+f2;
            f1=f2;
            f2=f3;
            if (isEven(f3)) {
                sum +=f3;
            }     
        }
        System.out.println("The sum is: " + sum);
        
    }
    
    public static boolean isEven(int i) {
        return i % 2 == 0;
    }
    
    
    
}
