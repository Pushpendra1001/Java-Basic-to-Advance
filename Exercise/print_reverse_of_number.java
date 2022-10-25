import java.util.*;

class reverse{
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);

        int number = ob.nextInt();

        // while( number > 0)
        // {
        //     int lastdigit = number % 10;  // 5560   
        //     System.out.print(lastdigit);
        //      number = number / 10;
        // }

        //  Another method to reverse a number 
        int reverse_no = 0;
        
        while( number > 0)
        {
            int lastdigit = number % 10;  // 4573   
            reverse_no = (reverse_no*10)+lastdigit;
            number = number / 10;
        }

        System.out.println(reverse_no);
    }
}