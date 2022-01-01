package day2;
import java.util.Scanner;
public class Min {
    public static void main (String[] args) {
        String number = "Please Enter Number";
      try{
        int a, b, c;
        Scanner min = new Scanner(System.in);
        System.out.println("Enter Number: ");
        a = min.nextInt();

        System.out.println("Enter Number: ");
        b = min.nextInt();

        System.out.println("Enter Number: ");
        c = min.nextInt();
        MinNumber(a,b,c);
    }
      catch (Exception ex){
          System.out.println(ex.getMessage());
      }
        System.out.println(number);
    }
    public static void MinNumber( int a, int b, int c){
        String message = "Invalid Number";
        if(a<=b && a<=c)
            message = a + " is Min";

        if(b<=a && b<=c)
            message = b + " is Min";

        if(c<=b && c<=a)
            message = c + " is Min";

        System.out.println(message);

    }
}
