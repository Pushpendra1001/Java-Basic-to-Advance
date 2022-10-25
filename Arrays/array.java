import java.util.*;

class array{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Size of array : ");
        // int n = sc.nextInt();
        // int arr[] = new int[n];
        // System.out.println(arr.length);
        
        int arr[] = new int[5];

        System.out.println("Enter Marks of subjects SAD , JAVA , DBMS : ");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        System.out.println("SAD : " + arr[0]);
        System.out.println("Java : " + arr[1]);
        System.out.println("DBMS : " + arr[2]);

        int per = ( arr[0] + arr[1] + arr[2] ) / 3;
        System.out.println("You Got " + per + "%");

    }
}