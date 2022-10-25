import java.util.*;

public class prime_no {
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int n = ob.nextInt();

        boolean isprime = true;
        for(int i=2; i<n; i++)
        {

            if( n % i==0 ){

                isprime = false;
            }
        }

        if(isprime == true){
            System.out.println("Its a prime Number ");
        }
        else{
            System.out.println("its not a prime number ");
        }
    }
}
