class sorting{

    public static void selection_sort(int arr[]){

       
        for(int i=0; i<arr.length-1; i++)  // Big O ---> O(n*n) 
        {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[minPos] > arr[j])
                {
                    minPos = j;
                }
            }

            // swap
            int temp = arr[minPos];            
            arr[minPos] = arr[i];
            arr[i] = temp;
        }

}


public static void bubble_sort(int arr[]){

    for(int i=0; i<arr.length; i++)
{
    for(int j=0; j<arr.length-1-i; j++)
    {
        if(arr[j] > arr[j+1])
        {
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}
}

public static void inserting_sort(int arr[])
{
    for(int i=1; i<arr.length; i++)
    {
        int temp = arr[i];
        int j = i-1;

        while ( j>=0 && arr[j] > temp )   // { 3,5,1,2,4 };
        {
            arr[j+1] = arr[j]; 
            j--;
        }
        arr[j+1]= temp;
    }
}
    
    
    // printing function
   public static void Print_arr(int arr[]) {

    for(int i=0; i<arr.length; i++)
    {
        System.out.print(arr[i]+ " ");
    }
    
}

    public static void main(String[] args) {
        int arr[] = { 3,5,1,2,4 };
        // selection_sort(arr);
        inserting_sort(arr);
       Print_arr(arr);

    }
}