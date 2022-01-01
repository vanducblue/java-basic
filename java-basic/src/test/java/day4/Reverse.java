package day4;

public class Reverse {
    public static void main(String[] args) {
        String str = "coloring book";
        resul(str);
    }

    public static void resul(String str) {
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }
}
