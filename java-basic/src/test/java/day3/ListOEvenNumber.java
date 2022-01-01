package day3;

public class ListOEvenNumber {
    public static void main(String[] args) {
        int number = 100;
        result(number);
    }

    public static void result(int number) {
        System.out.println("The list of Even Number from 1 to 100: ");
        for (int n = 1; n <= number; n++) {
            if (n % 2 == 0)
                System.out.println(n + " ");

        }
    }
}