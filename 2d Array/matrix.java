import java.util.Scanner;

class matrix{

    public static boolean search(int arr[][] , int key)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                if(arr[i][j] == key)
                {
                    System.out.println("Element found at cell ("+i+","+j+")");
                    return true;
                }
            }

        }
        System.out.println("Element not found");
        return false;
    }


    public static void greatest(int arr[][])
    {
        int greatest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
            {
                if(arr[i][j] > greatest)
                {
                    greatest = arr[i][j];
                }

                if(arr[i][j] < lowest)
                {
                    lowest = arr[i][j];
                }
            }

        }
        System.out.println("The greatest is : " + greatest);
        System.out.println("The lowest is : " + lowest);
    }
    public static void main(String[] args) {
        
        int arr[][] = new int[3][3];
        int n= arr.length;
        int m= arr[0].length;

        Scanner ob = new Scanner(System.in);
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
               arr[i][j] = ob.nextInt();
            }

        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();

        }

        search(arr,  3);
        greatest(arr);

        
    }
}