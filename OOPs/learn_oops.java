import javax.sound.sampled.SourceDataLine;

public class learn_oops {
    public static void main(String[] args) {
        
        System.out.print("Hello Pushpendra ");
        pen_details p1 = new pen_details();

        // p1.setColor("Blue");
        System.out.print(p1.color);
        // System.out.println(p1.tipsize);
        p1.setTip(5);
        System.out.println(p1.tipsize);

    }
}

class pen_details{
    String color = " Green ";
    int tipsize;

    void setColor(String setColor)
    {
        color = setColor;
    }

    void setTip(int setTip)
    {
        tipsize = setTip;
    }
}
