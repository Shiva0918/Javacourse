import org.testng.annotations.Test;

@Test
public class excep
{
    @Test
    public static void main(String args[])
    {
        try {
            String a = null;
            System.out.println("This is the try block ");
        } catch(Exception e) {
            System.out.println("This is the catch block");
        }
        System.out.println("Hello world!!");
        int a=10;
        int b=20;
        int x=a+b;
        System.out.println("The the sum of two numbers is:" +x);
    }
}


