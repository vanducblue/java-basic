package day5;

public class EandOArray {
    public static void main(String[] args){
        int [] ar = {56, 45, 77, 70, 54, 55};
        for(int i = 0; i < ar.length; i++){
            if(ar[i]%2==0){
                System.out.println("Even number is: " + ar[i] );
            }
            else{
                System.out.println("Odd number is: " + ar[i]);
            }

        }
    }
}
