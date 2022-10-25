import java.util.Scanner;

public class number_piramid_pattern {

    public static void pattern(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=0; j<=(n-i); j++)
            {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++)
            {
                System.out.print(i+ "  ");
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        

        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Number of rows : ");
        int n = ob.nextInt();
        pattern(n);

        
    }
}
