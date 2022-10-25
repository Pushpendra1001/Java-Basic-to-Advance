import java.util.*;

public class ncr_factorial {

    public static int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact *  i;
        }
        return fact;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter r : ");
        int r = sc.nextInt();

        int n_factorial = factorial(n);
        int r_factorial = factorial(r);
        int n_r_factorial = factorial(n - r);  // n-r factorial solution 

        int ncr = n_factorial / (r_factorial * (n_r_factorial));

        System.out.println(ncr);

    }
}
