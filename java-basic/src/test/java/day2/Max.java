package day2;
import java.util.Scanner;


public class Max {
    public static void main (String[] args) {
                try {
            int a, b, c;
            Scanner max = new Scanner(System.in);
            System.out.println("Enter Number: ");
            a = max.nextInt();

            System.out.println("Enter Number: ");
            b = max.nextInt();

            System.out.println("Enter Number: ");
            c = max.nextInt();
            Maxnumber(a, b, c);
        }
        catch (Exception ex){
            System.out.println("Invalid value");
        }
            }
    public static void Maxnumber( int a, int b, int c){
        String message = "Invalid Number";
    if ( a>=b && a>=c)
        message = a + " is Max";
    else if ( b>=a && b>=c)
        message = b + " is Max";
    else if (c>=a && c>=b)
        message = c + " is Max";
        System.out.println(message);
    }

}
