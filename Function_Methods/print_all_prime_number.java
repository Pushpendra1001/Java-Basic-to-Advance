//  This program will print all the prime numbers which you want to display like if you enter 10 so it print 2,3,5,7 .
import java.text.BreakIterator;
import java.util.*;
public class print_all_prime_number {

    public static boolean is_prime(int n) {

        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void display(int n){

        
        for(int i=1; i<=n; i++)
        {
             
            boolean result =is_prime(i);
            if(result == true)
            {
                System.out.print(i+ " ");
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        display(n);
    }
}
