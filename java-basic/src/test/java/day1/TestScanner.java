package day1;
import java.util.Scanner;
public class TestScanner {
    public static void main(String[] args){
        int a, b, c;
        Scanner quet = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        a = quet.nextInt();

        System.out.println("Enter the second number: ");
        b = quet.nextInt();

        System.out.println("Enter the third number: ");
        c = quet.nextInt();
        Maxnumber(a, b, c);
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

