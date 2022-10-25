import java.util.*;

public class function_overloading {

    /*  Here we make two function with same name sum() but with different argument
       there is no mater what is return type of function it's only matter with 
       what type of parameters are or different type of argument or 
       that is called function overloading 
     */
    public static int sum(int a , int b){
        return a+b;
    }

    public static int sum(int a , int b , int c){
        return a+b+c;
    }

    public static float sum(float a , float b , float c){
        return a+b+c;
    }

    public static void main(String[] args) {
        // Scanner ob = new Scanner(System.in);

        System.out.println(sum(3,5));
        System.out.println(sum(3,4,22)); // here we do function overloading with quantity of argument 
        System.out.println(sum(0.10f, 0.20f, 0.10f)); // here we do function overloading with different data type 
    }
}
