import java.lang.*;

public class Rectangle extends Shape
{
    protected double width;
    protected double length;

    public Rectangle()
    {
        this.width = 2;
        this.length = 3;
        this.color = "green";
        this.filled = true;
    }
    public Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
        this.color = "yellow";
        this.filled = false;
    }
    public Rectangle(double width, double length, String color, boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length = length;
    }

    @Override
    public double getArea()
    {
        return this.width*this.length;
    }

    @Override
    public double getPerimeter()
    {
        return 2*this.length*this.width;
    }
    @Override
    public String toString()
    {
        return "Sides of rectangle are: length: "+this.length+"|width: "+this.width;
    }
}
