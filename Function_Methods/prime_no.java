import java.util.Scanner;

public class prime_no {

    // public static boolean prime(int n){
    //     boolean prime_no = true;

    //     for(int i=2; i<=(n-1); i++){
    //         if(n%i ==0)
    //         {
    //             prime_no = false;
    //         }
    //     }

    //    return prime_no;
    // }

    // mathod 2 for check prime number 
    // public static boolean prime(int n){

    //     for(int i=2; i<=(n-1); i++){
    //         if(n%i ==0)
    //         {
    //        return false;
    //         }
    //     }

    //    return true;
    // }

    //  Method 3 or best way to check is it prime number with optimised code of prime number 
    public static boolean prime(int n){

        if(n==2)
        {
            return true;
        }

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = ob.nextInt();

    boolean result =   prime(n);

        if(result==true)
        {
            System.out.println("The given number is prime");
        }
        else{
            System.out.println("The given number is not prime");
        }
       
    }    
}
