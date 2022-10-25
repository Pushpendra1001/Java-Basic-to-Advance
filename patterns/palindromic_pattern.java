import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<=n; i++){
            for(int j=0; j<=(n-i); j++){
                System.out.println(" ");
            }

            for( int j=(n-i); j<=1; j++ ){
                System.out.println(i);
            } 
        }

        

    }
}