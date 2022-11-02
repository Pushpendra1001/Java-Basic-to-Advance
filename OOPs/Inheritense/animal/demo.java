class demo2{
    public static void main(String[] args) {
        

        dogs puppy = new dogs();
        cats el = new cats();
        System.out.println(el.legs);
        System.out.println(puppy.legs);

        puppy.walk();
        puppy.breath();

    }
}

class Animal{
    void breath(){
        System.out.println("I am Taking breath");
    }
}

class mammel extends Animal{
    void walk()
    {
        System.out.println("I am Walking");
    }

}

class dogs extends mammel{
    int legs = 4;
}

class cats extends mammel{
    int legs = 4;

}

class bird extends Animal{
    void fly()
    {
        System.out.println("I can Fly");
    }
}

class peacock extends bird{
    int wings = 24;
}

class parrot extends bird{
    String color = "green";
}

class fish extends Animal{
    void swim()
    {
        System.out.println("I can Swim");
    }
}

class shark extends fish{
    boolean danger = true;
}

class dolphin extends fish{
    boolean danger = false;
}
