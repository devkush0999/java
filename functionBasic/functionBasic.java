package functionBasic;
import java.util.*;

public class functionBasic {
    
    public static void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

    }
    public static int calculateSum( int a, int b ) {  //parameter 0r formal parameter
        int sum = a + b ; 
        return sum;
    }
    public static int multiply( int a, int b ) {  //parameter 0r formal parameter
        int multi = a * b ;
        return multi;
    }
    public  static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n; i++){
            f  = f * i;
        }
        return f;
    }
    public static int binomial(int n , int r) {
        
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n-r);
        int binomial = fact_n / (fact_r * fact_n_r);
        return binomial;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("welcome to  all calculator");
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();


        int sum = calculateSum(a, b);  // arguents or actual parameter

        int multi = multiply(a, b);

       int  fact = factorial(a);

       int binom = binomial(a, b);


        System.out.println("Sum is :" + sum);
        System.out.println("Multiplied is :" + multi);
        System.out.println( "factoria is " + fact); 
        System.out.println("binomial is " + binom);
       
        
        // calculateSum(a,b);
        // printHello();
    
    }
    
   
}
    

