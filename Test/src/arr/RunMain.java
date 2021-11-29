package arr;

import java.util.ArrayList;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(10);
        list.add(1);
        list.add(6);

//        list.set(1, 3);
//
//        list.remove(2);

        System.out.println(list.indexOf(1));
        System.out.println(list.lastIndexOf(1));


        if(list.isEmpty()) {
            System.out.println("Rỗng");
        }else {
            System.out.println("Không rỗng");
        }

//        list.clear();

//        list.forEach(i -> System.out.println(i+1));

        System.out.println(list.subList(1, 4));

        System.out.println(list);
    }
}
