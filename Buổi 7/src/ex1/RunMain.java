package ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(0);
        list.add(10);

//        Set<Integer> set = new HashSet<>(list); // không được trùng nhau
//        System.out.println(set);

        // foreach
//        list.forEach(i -> {
//            System.out.print(i + " ");
//        });
        //stream
//        list.forEach(System.out::println);

//        Stream<?> stream1 = list.stream();

        System.out.println(list.stream().max(Integer::compare).get()); //max
        System.out.println(list.stream().min(Integer::compare).get()); //min

        System.out.println(list.stream().sorted().collect(Collectors.toList())); // Sắp xếp tăng dần
        System.out.println(list.stream().sorted((trc, sau) -> sau - trc).collect(Collectors.toList())); // Sắp xếp giảm dần

        // lấy các phần tử không trùng nhau: 2 cách
        System.out.println(list.stream().distinct().collect(Collectors.toList()));
        System.out.println(list.stream().collect(Collectors.toSet()));

//        ArrayList<?> odds = (ArrayList<Integer>) list.stream().filter(item -> {
//            return item % 2 == 0;
//        }).collect(Collectors.toList()); // Lọc các số chẵn
        ArrayList<?> odds = (ArrayList<Integer>) list.stream().filter(item -> item % 2 == 0).collect(Collectors.toList()); // Lọc các số chẵn
        System.out.println(odds);




    }
}
