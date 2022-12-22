import java.lang.*;

public class Square extends Rectangle
{
    public Square()
    {
        this.width = 2;
        this.length = 2;
        this.color = "blue";
        this.filled = false;
    }
    public Square(double side)
    {
        this.length = side;
        this.width = side;
        this.color = "red";
        this.filled = true;
    }
    public Square(double side, String color, boolean filled)
    {
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide()
    {
        return this.length;
    }
    public void setSide(double side)
    {
        this.length = side;
        this.width = side;
    }
    @Override
    public void setWidth(double side)
    {
        this.width = side;
    }
    @Override
    public void setLength(double side)
    {
        this.length = side;
    }
    @Override
    public String toString()
    {
        return "Square's sides are "+this.width;
    }
}
