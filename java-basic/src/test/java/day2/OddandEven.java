package day2;
import java.util.Scanner;
public class OddandEven {
    public static void main(String[] args) {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        n = sc.nextInt();
        OandE(n);
    }
    public static void OandE(int n){

        if(n%2==0)
        {
            System.out.println(n + " Even Number");
        }
        else
        {
            System.out.println(n + " Odd Number");
        }

    }
}

