import java.util.Scanner;

public class sum_of_odd_even {
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);

        System.out.print("Enter How many integer You want to Enter : ");
        int size = ob.nextInt();
        int even=0,odd=0;

        for(int i=0 ; i<size; i++)
        {
            System.out.print("Enter Number : ");
            int number = ob.nextInt();
            if(number%2==0)
            {
                even = even + number ;
            }
            else{
                odd = odd + number ;
            }
        }

        System.out.println("The sum of all odd number is : " + odd);
        System.out.println("The Sum of all even number is : " + even);
    }
}
