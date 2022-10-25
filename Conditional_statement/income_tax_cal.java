package Conditional_statement;
import java.util.*;

public class income_tax_cal {
        
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int salary = ob.nextInt();
        int tax;
        if(salary < 500000)
        {
                tax = 0;
        }
        else if(salary > 500000 && salary < 1000000)
        {
            tax = (int) (salary * 0.2);
        }
        else{
            tax = (int) (salary * 0.3);
        }

        System.out.println("You Pay tax " + tax);
    }
}
