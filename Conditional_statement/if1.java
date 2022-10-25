import java.util.*;


public class if1 {
    public static void main( String arg[]){

        Scanner ob = new Scanner(System.in);
        // int a = ob.nextInt();
        // int b = ob.nextInt();

        // check which is greater
        // if(a>b)
        // System.out.println("A is greater ");
        // else if(b>a)
        // System.out.println("B is greater ");
        // else
        // System.out.println("Equal");

        //  Check even or odd
        
        // if(a%2==0){
        //     System.out.println("its even");
        // }
        // else{
        //     System.out.println("its odd");
        // }

             //  Check even or odd by Using Ternary operator

            //  int number = 4056;

            //  String type = ((number%2)==0) ? "Even" : "odd ";

            //  System.out.println(type);

            // check student is fail or pass using Ternary operator

            int marks = 33;

            String result = (marks>=33) ? "Pass" : " Fail ";
            System.out.println(result);
    }

}
