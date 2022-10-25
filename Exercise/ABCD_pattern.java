public class ABCD_pattern {
    public static void main(String[] args) {
        
        int n = 5;
        char ch = 'A';
        int count=0;
        for( int i=1; i<=n; i++)
        {
            for( int j=1; j<=i; j++)
            {
                System.out.print(ch+ " ");
                ch++;
                count = count + 1;
            }
            System.out.println();
        }
        System.out.println("total is " + count);
    }
}
