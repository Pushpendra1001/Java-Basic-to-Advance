// import java.util.Scanner;


// public class Linear_search {

//     public static void searching( String menu[] , String item){

//         for(int i=0 ; i<menu.length; i++){
//             if(menu[i].equals(item) ){
//                 System.out.println("Element found at " + i);
//                 return ;
                
//             }
            
//         }
//         System.out.println("Element not found");

//        }
//     public static void main(String[] args) {
//         String menu[] = { "Dosa" , "Samosa" , "Paitise" , "Fruty" , "Dew" , "Dairy Milk" , "Ice Cream" };

//         Scanner sc = new Scanner(System.in);

//         String item;
//         System.out.print("Enter Item name to be search : ");
//         item = sc.nextLine();
//         searching(menu , item);
//         for(int i=0; i<menu.length; i++)
//         {
//             System.out.println(menu[i]);
//         }
//     }    
// }


import java.util.*;

public class Linear_search{

    public static void searching(int arr[] , int element){

        for(int i=0 ; i<arr.length; i++){
            if(arr[i]==element)
            {
                System.out.println(" Element found at " + i + "postion");
            }
        }
        System.out.println(" Element not found");

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Element which you want to search : ");
        int element = sc.nextInt();

        searching(arr, element);


    }
}