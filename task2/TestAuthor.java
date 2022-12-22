import java.lang.*;

public class TestAuthor
{
    public static void main(String[] args)
    {
        Author a1 = new Author("Alex", "al123@gmail.ru", 'm');
        Author a2 = new Author("Jane", 'f');
        a2.setEmail("jenny01@gmail.com");
        System.out.println(a1);
        System.out.println(a2);
    }
}
