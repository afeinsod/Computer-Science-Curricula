package mathoperations;

public class MathOperations {
     public static void main( String[] args ) {
         int p,q,r,s,t,u;
          double a,b,c;
          String first, second, together;
 
          p = 8;
          q = 25;
         System.out.println( "p is " + p + ", q is " + q );
 
         r = p + q;
         System.out.println( "p+q is " + r );
         s = p - q;
         System.out.println( "p-q is " + s );
         t = p+q*3;
         System.out.println( "p+q*3 is " + t );
         u = q / 2;
         System.out.println( "q/2 is " + u );
        
        a = 1.1;
         System.out.println( "a is " + a );
         b = a*a;
         System.out.println( "a*a is " + b );
         c = b / 2;
         System.out.println( "b/2 is " + c );
         System.out.println();

         first = "peanut butter";
         second = "jelly";
         together = first + " and " + second;
         System.out.println( together );
         
         int v= p*q-r+s/t;
         int x = p*q*r - 4;
         double w=a/b + c/p;
         double y = (a+b)/r;
         String candy = second + "bean";
         System.out.println("p*q-r+s/t is " + v);
         System.out.println("p*q*r - 4 is " + x);
         System.out.println("a/b + c/p is " + w);
         System.out.println("(a+b)/r is " + y);
         System.out.println(candy);
         
         v++;
         System.out.println("v is now " + v);
         a+=7;
         System.out.println("a is now " + a);
     }
}