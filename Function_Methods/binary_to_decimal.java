import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Your binary ");
        int n = ob.nextInt();

        int decimal= 0;
        int i=0;

        while(n!=0)
        {
            int ld = n%10;
            n = n/10;
            decimal = decimal +  ld * (int)(Math.pow(2,i));
            i++;
        }
        System.out.println(decimal);
        
    }
}
