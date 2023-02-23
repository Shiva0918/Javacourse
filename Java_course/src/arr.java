import java.util.Scanner;
public class arr
{
    public static void main(String[] args) {



    Scanner input = new Scanner(System.in);

        int [] arr = {4,7,8,9};
        System.out.print("Enter the element for which you wanna find the position: " );
        int num1 = input.nextInt();
        switch (num1) {

            case 4:
                System.out.println("This is array element 0");
                break;

            case 7:
                System.out.println("This is array element 1");
                break;
            case 8:
                System.out.println("This is array element 2");
                break;

            case 9:
                System.out.println("This is array element  3");
                break;
            default:
                System.out.println("This is case is undefined or not found");
                break;
        }

    }
}

