package day4;

public class CountChar {
    public static void main(String[] args){
        String str = "The Animals Story";
        result(str);
    }
    public static void result(String str){
        char somechar = 'a';
        int count = 0;
        for(int a = 0; a<str.length(); a++){
            if(str.charAt(a)==somechar){
                count++;
            }
        }
        System.out.println(count);
    }
}
