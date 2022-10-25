import java.util.*;

public class check_leap_year {
        public static void main(String[] args) {
            
            Scanner ob = new Scanner(System.in);

            int year = ob.nextInt();

            if( year%4==0)
            {
                System.out.println("it's leap year");
            }
            else{
                System.out.println("its not a leap year ");
            }

        }    
}
