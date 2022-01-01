package day4;

import java.util.Locale;

public class Homework {
    public static void main(String[] args){
        String a = "Hello World ";
        String b = "Welcome";
        ignoringcase(a,b);
        concatenate(a,b);
        length(a,b);
        substring(a);
        upper(a,b);
        lower(a,b);
    }
    public static void ignoringcase(String a, String b){
         System.out.println(a.equalsIgnoreCase(b));
    }
    public static void concatenate(String a, String b){
        System.out.println(a.concat(b));
    }
    public static void length(String a, String b) {
        System.out.println((a + b).length());
    }
    public static void substring(String a) {
        System.out.println(a.substring(0,6));
    }
    public static void upper(String a,String b) {
        System.out.println((a+b).toUpperCase(Locale.ROOT));
    }
    public static void lower(String a,String b) {
        System.out.println((a+b).toLowerCase(Locale.ROOT));
    }
}
