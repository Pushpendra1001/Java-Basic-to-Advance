package school;
class demo{
    public static void main(String[] args) {
        
        teacher t1 = new teacher();
        t1.attendence();
        student st = new student();
        st.attendence();
        st.study();
        // t1.study();
        System.out.println(t1.time);
        System.out.println(st.time);
        
        
    }
}

 class school{
    int time = 8 ;
}

class teacher extends school{
    int id = 3434;

    void attendence()
    {
        System.out.println("Taking attendence");
    }
}

class student extends teacher{
    int roll = 111;

    void study()
    {
        System.out.println("doing study");
    }
}