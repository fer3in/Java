public class MovableCircle
{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.radius = radius;
    }
    public String toString(){return "Moved.";}
    public void moveUp(){}
    public void moveDown(){}
    public void moveLeft(){}
    public void moveRight(){}
}
