
import java.util.*;

class find_factorial {
    
    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=5; i++)
        {
            fact = fact * i;

        }
        return fact;
    }
    public static void main(String[] args) {
     
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = ob.nextInt();

    System.out.println(factorial(n)); 
    
    }
}
