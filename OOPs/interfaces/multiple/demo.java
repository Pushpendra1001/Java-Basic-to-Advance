package multiple;
class testing {
    public static void main(String[] args) {
        bear b1 = new bear();
        b1.eats();
    }
}

interface carnivorous{
    void eats();
}

interface herbivorus{
    void eats();
}

class bear implements carnivorous , herbivorus{
    public void eats()
    {
        System.out.println("I can eat");
    }
}


