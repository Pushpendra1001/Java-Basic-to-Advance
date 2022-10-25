import java.util.Scanner;

public class infinity_getting_no {
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        do{
            int number = sc.nextInt();

            if(number % 10 == 0){
                break;
            }
            System.out.println("Your number is " + number);
        }while(true);
    }

}
