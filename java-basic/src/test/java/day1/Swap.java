package day1;

public class Swap {
    public static void main(String[] args){
        int a = 10, b = 5;
        System.out.println("Before");
        System.out.println("a " + a);
        System.out.println("b " + b);
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("After");
        System.out.println("a " + a);
        System.out.println("b " + b);
    }
}
