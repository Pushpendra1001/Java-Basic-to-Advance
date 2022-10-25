
import java.util.Scanner;



public class product_2_no {

    public static int multi(int a , int b){
        int result = a*b;
        return result;
    }

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        int a = ob.nextInt();
        int b = ob.nextInt();

     System.out.println(multi(a,b));
    }
}

