package day3;

import java.util.Scanner;

public class MultiplicationTablewithWhile {
    public static void main(String[] args) {
        try {
            int a , b = 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number:");
            a = sc.nextInt();
            System.out.println("Multiplication Table of " + a);
            result(a, b);
        } catch (Exception ex) {
            System.out.println("Invalid value");
        }
    }

    public static void result(int a, int b) {

        while (b <= 10) {
            System.out.println(a + " * " + b + " = " + a * b);
            b++;
        }
    }
}
