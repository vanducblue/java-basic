package day5;

public class Sumarray {
    public static void main(String[] args) {
        int[] cars = {34, 45, 23, 10};
        int sum = 0;
        for(int i = 0; i < cars.length; i++)
            sum = sum + cars[i];
        System.out.println(sum);
    }

    }

