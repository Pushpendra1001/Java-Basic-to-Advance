import java.util.*;
public class calculator {

    public static void main(String[] args) {
        

        Scanner ob = new Scanner(System.in);

        System.out.println("Enter A");
        int a = ob.nextInt();
        System.out.println("Enter B");

        int b = ob.nextInt();


        System.out.println("which operation do you want + , - , * , / or %");
        char operation = ob.next().charAt(0);

        switch(operation){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("invalid operator");
        }
    }
    
}
