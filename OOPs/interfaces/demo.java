class demo{
    public static void main(String[] args) {
        herbivorus h1 = new herbivorus();
        carnivorous h2 = new carnivorous();
        h1.eats();
        h2.eats();
    }
}

// class animal{
//     void eat()
//     {
//         System.out.println("Animal's eats")
//     }
// }
interface animal{
    void eats();
}

class carnivorous implements animal {
    public void eats(){
        System.out.println("I eat meat");

     }
}

class herbivorus implements animal{
   public  void eats(){
    System.out.println("i eat grass");
   }
}



