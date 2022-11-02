 class this_keyword {


    public static void main(String[] args) {
    
        System.out.println("Hello");

        
        pen_value ob = new pen_value();

        System.out.println(ob.color);
        ob.getColor("Green");
        System.out.println(ob.color);
        
    }
    
}

class pen_value
    {
        String color = " Blue" ;
        int price ;

        void getColor(String setColor)
        {
            this.color = setColor;
            
        }

        void setPrice(int setprice)
        {
            price = setprice;
        }

    }