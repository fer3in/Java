import java.lang.*;

public class TestBook
{
    public static void main(String[] args)
    {
        Book b1 = new Book("The Crime and Punishement", "Dostoevsky F.M.", 1866);
        Book b2 = new Book("The Lovely Bones", "Alice Sebold", 2002);
        Book b3 = new Book("The Shining", "Stephen King");
        b3.setYear(1977);
        System.out.println(b1);
        b1.howOld();
        b2.howOld();
        b3.howOld();

    }
}
