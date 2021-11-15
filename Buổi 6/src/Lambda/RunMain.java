package Lambda;

import java.util.ArrayList;
import java.util.stream.Stream;


public class RunMain {
    protected void show(int a, int b){};
    public static void main(String[] args) {
//        if(true) System.out.println("abc");
        /*
            (parameter) -> {khối code}
                1         2      3

                (parameters) -> {khối code}
                1         2      3
        * */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

//        for(int i=0; i<list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for (Integer i : list) {
//            System.out.println();
//        }

//        list.forEach((element) -> {
//            System.out.println(element);
//        });

//        list.forEach((element) -> System.out.println(element));

        list.forEach(element -> {
            if(element % 2 == 0) {
                System.out.println(element);
            }
        });

//        Stream API

//        - class
//        - kết tập
//        - Kế thừa
//        - Arraylist
//        - Lambda
    }
}
