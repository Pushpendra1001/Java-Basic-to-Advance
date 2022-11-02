class A{

    public static void main(String arg[])
    {
        // pushpa ob = new pushpa();
        // pushpa ob2 = new pushpa(4);
        pushpa ob3 = new pushpa(4 , 5);
        pushpa ob4 = new pushpa(ob3);

       System.out.println(ob4.a);
    }
}

class pushpa{

    int a,b ;

    pushpa()
    {
        System.out.println("Hello Pushpa !!");
    }

    pushpa(int x)
    {
        int y = x;
        System.out.println(y);
        System.out.println("THere is one argument");
    }
    pushpa(int a , int b)
    {
        System.out.println(a+b);
    }

    pushpa(pushpa ob)
    {
        a = ob.a;
        b = ob.b;

        System.out.println(a+b);
    }
}