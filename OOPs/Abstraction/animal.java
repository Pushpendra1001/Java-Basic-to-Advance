class demo{
    public static void main(String[] args) {
        // horse h1 = new horse();
        // h1.changeColor();
        // h1.walk();
        // chicken c1 = new chicken();

        mustang m1 = new mustang();
        
        

    }
}

abstract class animal{
    String color ;
    animal()
    {
        color = "Brown";
        System.out.println(color);
    }

    void eat(){
        System.out.println("Animal Eats");
    }

    abstract void walk();

}

class horse extends animal{
    void walk(){
        System.out.println("Horse walk on 4 legs");
    }

    horse(){
        System.out.println("Heee HAAAA");
    }

    void changeColor()
    {
        color = "dark brown";
        System.out.println(color);
    }
}

class mustang extends horse{
    mustang(){
        System.out.println("Horee Horee HOree");
    }
}
class chicken extends animal{
    void walk()
    {
        System.out.println("chicken walk on 2 legs");
    }

    chicken()
    {
        System.out.println("KO Ko Ko KO ");
    }
}
