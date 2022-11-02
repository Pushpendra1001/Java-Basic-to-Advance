import java.util.*;

class spiral {

    public static void getvalue(int arr[][]) {
        Scanner ob = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = ob.nextInt();
            }
        }
    }

    // public static void printing(int arr[][])
    // {
    // for(int i=0; i<arr.length; i++)
    // {
    // for(int j=0; j<arr[0].length; j++)
    // {
    // // System.out.print(arr[i][j] + " (" + i + "," + j + ") ");
    // System.out.println(arr[i][j] + " ");
    // }
    // System.out.println();
    // }

    // }

    public static void spiral(int arr[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = arr.length - 1;
        int endcol = arr[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {

            // top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(arr[startrow][j] + " ");
            }
            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(arr[i][endcol] + " ");
            }
            // bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(arr[endrow][j] + " ");
            }
            // left
            for (int i = endrow - 1; i >= startcol + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(arr[i][startcol] + " ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;

        }
        System.out.println();
    }

    public static void main(String[] args) {

        // int arr[][] = { { 1, 2, 3, 4 },
        //                 { 5, 6, 7, 8 },
        //                 { 9, 10, 11, 12 },
        //                { 13 ,14 ,15 ,16} };
        int arr[][] = { {1 , 2 ,3},
                        { 4 , 5 ,6},
                        { 7 , 8 ,9}                       
                        };

        // getvalue(arr);
        // printing(arr);
        spiral(arr);

    }

}
