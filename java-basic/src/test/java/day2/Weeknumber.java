package day2;

public class Weeknumber {
    public static void main(String[] args) {
        int n = 6;
       printdate(n);
        printdate_IfElse(80);
    }
    public static void printdate_IfElse(int n){
        String message = "+ Invalid Day";
        if(n == 1)
            message = "Monday";
            else if(n == 2)
            message = "Tuesday";
            else if(n == 3)
            message = "Wednesday";
            else if(n == 4)
            message = "Thursday";
            else if(n == 5)
            message = "Friday";
            else if(n == 6)
            message = "Saturday";
            else if(n == 7)
            message = "Sunday";
        System.out.println(message);
    }

    public static void printdate(int n){
        String weeknumber;
        switch (n){
            case 1:
                weeknumber = "Monday";
                break;
            case 2:
                weeknumber = "Tuesday";
                break;
            case 3:
                weeknumber = "Wednesday";
                break;
            case 4:
                weeknumber = "Thursday";
                break;
            case 5:
                weeknumber = "Friday";
                break;
            case 6:
                weeknumber = "Saturday";
                break;
            case 7:
                weeknumber = "Sunday";
                break;
            default:
                weeknumber = "invalid week";
                break;
        }
        System.out.println(weeknumber);
    }
}
