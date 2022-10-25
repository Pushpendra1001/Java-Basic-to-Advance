import java.util.*;

class check_no{
    public static void main(String arg[]){

        Scanner ob = new Scanner(System.in);

        int number = ob.nextInt();

        if(number > 0)
        {
            System.out.println("Its positive number ");
        }
        else if( number < 0)
        {
            System.out.println("its negative Number");
        }
        else{
            System.out.println("it's Zero ");
        }
    }
}