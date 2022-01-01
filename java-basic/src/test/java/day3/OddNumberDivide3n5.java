package day3;

public class OddNumberDivide3n5 {
    public static void main(String[] args) {
        int number = 100;
        result(number);
    }

    public static void result(int number) {
        System.out.println("The list of Odd Number Divide 3 & 5 from 1 to 100: ");
        for (int n = 1; n < number; n++) {
            if (n % 3 == 0 && n % 5 == 0)
                System.out.println(n);
        }
    }
}
