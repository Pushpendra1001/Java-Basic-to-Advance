import java.util.*;

public class factorial {

    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = ob.nextInt();

        int factorial = 1;

        for( int i=1; i<=n; i++)
        {
            factorial = factorial * i;
        }

            System.out.println(factorial);

    }
}
