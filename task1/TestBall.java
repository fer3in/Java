import java.lang.*;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball m1 = new Ball("Red", "resin");
        Ball m2 = new Ball("Green", 10, "plastic");
        Ball m3 = new Ball("Blue", 6, "leather");
        m1.setDiameter(4);
        System.out.println(m1);
        m1.findRadius();
        m2.findRadius();
        m3.findRadius();
    }
}
