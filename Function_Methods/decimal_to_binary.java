import java.util.Scanner;

 class decimal_to_binary {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int n = ob.nextInt();

        int Binary = 0;
        int i=0;

        while(n!=0)
        {
            int r = n%2;
            Binary = Binary + (r * (int)Math.pow(10, i));
            i++;
            n=n/2;
        }
        System.out.println(Binary);
        
    }
}
