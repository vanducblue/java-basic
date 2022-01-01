package day6;

import java.util.ArrayList;

public class Arraylisttest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Monday");
        arrayList.add("Monday");
        arrayList.add("Monday");
        arrayList.add("Tuesday");
        arrayList.add("Wednesday");
        arrayList.add("Thursday");
        arrayList.add("Saturday");
        arrayList.add("Sunday");

        ArrayList<String> deleteAll = new ArrayList<>();
        deleteAll.add("Monday");
        deleteAll.add("Tuesday");

        arrayList.removeAll(deleteAll);
        System.out.println(arrayList);
    }
}
//        int count = 0;
//        for(int i; i < arrayList.size(); i++){
//                            System.out.println(arrayList.get(i));
//            }
//        }
//    }
