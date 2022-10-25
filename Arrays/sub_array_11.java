public class sub_array_11 {

    public static void subarray(int arr[])
    {
        int totalsum = 0;
        int total = 0;
        int greatest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            int start =i;
            for(int j=i; j<arr.length; j++)
            {
                int end = j;
                
                int sum =0;
                for(int k=start; k<=end; k++)
                { 
                    // System.out.print(arr[k]+ " ");
                    totalsum = arr[k] + totalsum ;
                    sum = arr[k] + sum;


                }
                System.out.print(" : "+sum);
                
                if(sum > greatest)
                {
                    greatest = sum;
                }
                if( sum < smallest)
                {
                    smallest = sum;
                }
                total++;
                System.out.println();
            }

            System.out.println();

        }

        System.out.println("total subarray array : " + total);
        System.out.println(" The sum of all subarray is : " + totalsum );
        System.out.println(" The largest  sum is : " + greatest);
        System.out.println(" The smallest sum is : " + smallest);
    }


    public static void kadans(int arr[])
    {
        int ms = Integer.MIN_VALUE;
        int ss = Integer.MAX_VALUE;
        int cs = 0;
        for(int i=0; i<arr.length; i++)
        {   
            cs = cs + arr[i];
            if( cs < ss)
            {
                ss = cs;
            }
            if(cs < 0)
            {
                cs = 0;
            }
            


            ms = Math.max( cs , ms );
        }
        System.out.println(ms);
        System.out.println(ss);

    }
    public static void main(String[] args) {
        // int arr[] = { 2 ,4 , 6, 8 , 10};
        int arr[] = { -2 , -8 , 4 , -1 , -2 , 1 , 5 , -12};


        // subarray(arr);

        kadans(arr);
        


    }
}
