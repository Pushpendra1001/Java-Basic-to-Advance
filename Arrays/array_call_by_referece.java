
public class array_call_by_referece {

     /* 
     call by reference -:  Here we use call by reference so when we change the value in function it
                           change also in main function it's called call by reference 
     */
    
    public static void update(int marks[]){

        for(int i=0 ; i<marks.length; i++)
        {
            marks[i] = marks[i] + 1;

        }
    }
    public static void main(String[] args) {
        
        int marks[] = { 23 ,43, 65} ;


        update(marks);
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
