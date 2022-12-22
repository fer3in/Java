import java.lang.*;

public class Circle extends Shape
{
    protected double radius;

    public Circle()
    {
        this.radius = 1;
        this.color = "black";
        this.filled = true;
    }
    public Circle(double radius)
    {
        this.radius = radius;
        this.color = "white";
        this.filled = false;
    }
    public Circle(double radius, String color, boolean filled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    @Override
    public double getArea()
    {
        return 3.14 * this.radius * this.radius;
    }
    @Override
    public double getPerimeter()
    {
        return 2 * 3.14 * this.radius;
    }
    @Override
    public String toString()
    {
        return "Circle is "+this.radius+" in radius and "+this.color+" color.";
    }
}
