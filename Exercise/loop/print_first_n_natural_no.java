import java.util.*;

class nature_no{
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);

        int number = ob.nextInt();
        int total=0;
        for(int i=0; i<=number; i++)
        {
            total = total + i;
        }

        System.out.println(total);

    }
}