package day5;

public class EverageArray {
    public static void main(String[] args) {
        int[] ar = {4, 6, 8, 9};
        int sum = 0;
        double average = 0;
        for(int i = 0; i<ar.length; i++)
            sum = sum + ar[i];
//        double ave = Double.parseDouble(sum + "")/ar.length;
//        System.out.println(ave);
        average = sum / ar.length;
        System.out.println(average);
    }
    }