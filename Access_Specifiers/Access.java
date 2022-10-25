class Access{

    public static void main(String[] args) {
        
        public1 user1 = new public1();
        System.out.println(user1.username); 
        System.out.println(user1.password); 
        
        user1.changepass("Somya");

        System.out.println(user1.password); 

    }

}

class public1{
    String username = "pushpendra";
   private public String password = " Nothing"; // Not accessable in private 
   
   void changepass( String newPassword){
      password = newPassword;
   }
}