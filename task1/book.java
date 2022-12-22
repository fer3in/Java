import java.lang.*;

public class Book
{
    private String title;
    private String author;
    private int year;

    public Book(String t, String a, int y)
    {
        title = t;
        author = a;
        year = y;
    }
    public Book(String t, String a)
    {
        title = t;
        author = a;
        year = 0;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public String getTitle(String title)
    {
        return title;
    }
    public int getYear(int year)
    {
        return year;
    }
    public String toString()
    {
        return this.title+", author "+this.author+"; "+this.year;
    }
    public  void howOld()
    {
        System.out.println(title+" is "+(2022-year)+" years old.");
    }
}
