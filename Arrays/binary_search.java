import java.util.Scanner;

// import java.util.Scanner;

// public class binary_search {
    
    
//     public static int binary(int arr[] , int key){
//         int start = 0;
//         int end = arr.length-1;
//        while(start<=end)
//         {
//                 int mid = (start+end)/2;

//             if(arr[mid] == key)
//             {
//                return mid;
//             }
//             if(arr[mid] < key)
//             {
//                 start = mid+1;
//             }
//             else{
//                 end = mid-1;
//             }

//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         Scanner ob = new Scanner(System.in);

//         System.out.print("Enter Value to be search : ");
//         int key = ob.nextInt();

//         int arr[] = { 2 ,3 ,4 ,5 ,6 ,7 };

//         System.out.println(binary(arr, key));
//     }

// }


class binary_search{

    public static int searching(int arr[] , int key){

        int start=0;
        int end= arr.length-1;

        while(start<=end)
        {
            int mid = (start+end)/2;

            if(arr[mid]== key)
            {
                return mid;
            }

            if(arr[mid] < key)
            {
                start = mid+1;
            }
            else{
                end = end-1;
            }
        }
        return -1;
    }
        // for(int i=0; i<arr.length; i++)
        // {
        //     if(arr[i] == key)
        //     {

        //     }
        // }
    public static void main(String[] args) {
        int arr[] = { 2,3,4,5,6,7,8,10,12,23,34,45,56,67,78,89 };

        Scanner ob = new Scanner(System.in);

        System.out.print("Enter Value to be search : ");
        int key = ob.nextInt();
    
        System.out.println(searching(arr , key));
    }
}