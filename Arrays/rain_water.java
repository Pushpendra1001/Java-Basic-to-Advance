class rain_water{

    public static int trapped_water(int arr[]){
        
        // int arr[] = {2 , 4, 0 , 6 , 3 , 2 ,5 };
        
        //  Left max boundary
        int n = arr.length;
        int left_max[] = new int[n];

        left_max[0] = arr[0];
        
        for(int i=1; i<n; i++)
        {
            left_max[i] = Math.max(left_max[i-1], arr[i]);    // 4 , 2  = 4 for first case 
        }

        // right max boundary

        int right_max[] = new int[n];
        right_max[n-1] = arr[n-1];

        for(int i=n-2 ; i>=0; i--)
        {
            right_max[i] = Math.max(right_max[i+1] , arr[i]);
        }


        // find minimum from right or left = water level
       
        int trapped_water = 0;

        for(int i=0; i<n; i++)
        {
          int water_level = Math.min(left_max[i], right_max[i]);
            
            // trapped water = water level - height 
            trapped_water += water_level - arr[i];
        }

        return trapped_water;

        
    }

    public static void main(String arg[])
    {
        int arr[] = {4,2, 0 , 6 , 3 , 2 ,5 };
    
        System.out.println(trapped_water(arr)); 
    }
}