package day3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        try {
            int num;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number: ");
            num = sc.nextInt();
            System.out.println("Multiplication Table of " + num);
            result(num);
        } catch (Exception ex) {
            System.out.println("Invalid value");
        }
    }

    public static void result(int num) {
        for (int n = 1; n <= 10; n++) {
            System.out.println(num + " * " + n + " = " + num * n);
        }
    }
}
