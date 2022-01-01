package day1;

public class Sumandminus {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;
        add(x, y);
        add(4, 6);
        add(10, 5);

        minus(x, y);
        minus(7, 15);

        multi(x, y);
        multi(4, 8);

        divide(x, y);
        divide(32, 4);

    }

    public static void add(int x, int y) {
        int add = x + y;
        System.out.println("x " + "+" + " y " + "= " + add);
    }

    public static void minus(int x, int y) {
        int minus = x - y;
        System.out.println("x " + "-" + " y " + "= " + minus);
    }

    public static void divide(int x, int y) {
        int divide = x / y;
        System.out.println("x " + "/" + " y " + "= " + divide);
    }

    public static void multi(int x, int y) {
        int multi = x * y;
        System.out.println("x " + "*" + " y " + "= " + multi);
    }
}


