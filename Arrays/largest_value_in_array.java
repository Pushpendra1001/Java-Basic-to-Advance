
// public class largest_value_in_array {
    
//     public static int  largest(int arr[] ){

//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;

//         for(int i=0; i<arr.length; i++)
//         {
//             if(largest < arr[i])
//             {
//                 largest = arr[i];
//             }    
//             if(smallest > arr[i])
//             {
//                 smallest = arr[i];
//             }
//         }
//         System.out.println("Smallest is : " + smallest);
//         return largest;
//     }
    
//     public static void main(String[] args) {
        
//         int arr[] = { 2 ,3  ,4 ,6 ,7 };

//         System.out.println("Largest is : " + largest(arr));
//     }   
// }



class largest{

    public static int finding(int arr[] )
    {
    // int largest = Integer.MIN_VALUE;
    int largest = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(largest < arr[i])
            {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = { 2,3 ,4,6,7 , 91 , 45 , 3 , 67 };

        int result =finding(arr);
        System.out.println("Largest number is : " + result ) ;
    }
}