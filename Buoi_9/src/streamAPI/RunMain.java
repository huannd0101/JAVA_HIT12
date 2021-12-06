package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RunMain {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(10);
        list.add(10);

        //Filter: lọc các phần tử thỏa mãn với điều kiện: Thread
//        ArrayList res1 = (ArrayList) list.parallelStream().filter((item) ->  {
//            System.out.println(item);
//            return item % 2 == 0;
//        }).collect(Collectors.toList());
//
//        System.out.println(res1);

        //Map: trả về 1 mảng giữ nguyên số lượng phần tử trong mảng và có thể thay đổi giá trị của phần tử trong mảng
        System.out.println(list.stream().skip(2).map(item -> {
            System.out.println(Thread.currentThread().getName());
            if(item % 2 == 0) {
                return item;
            }
            return 0;
        }).collect(Collectors.toList()));

        //skip: bỏ qua n phần tử đầu tiên

        //Thread.currentThread().getName(): Lấy ra tên luồng đang chayj
//        Arrays.asList("a1", "a2", "b1", "c2", "c1")
//                .parallelStream()
//                .filter(s -> {
//                    System.out.format("filter: %s [%s]\n",
//                            s, Thread.currentThread().getName());
//                    return true;
//                })
//                .map(s -> {
//                    System.out.format("map: %s [%s]\n",
//                            s, Thread.currentThread().getName());
//                    return s.toUpperCase();
//                })
//                .forEach(s -> System.out.format("forEach: %s [%s]\n",
//                        s, Thread.currentThread().getName()));

    }
}
/*
* filter: b1 [main]
filter: a1 [ForkJoinPool.commonPool-worker-9]
map: a1 [ForkJoinPool.commonPool-worker-9]
filter: c1 [ForkJoinPool.commonPool-worker-5]
map: c1 [ForkJoinPool.commonPool-worker-5]
forEach: C1 [ForkJoinPool.commonPool-worker-5]
filter: a2 [ForkJoinPool.commonPool-worker-19]
map: a2 [ForkJoinPool.commonPool-worker-19]
filter: c2 [ForkJoinPool.commonPool-worker-23]
map: c2 [ForkJoinPool.commonPool-worker-23]
forEach: C2 [ForkJoinPool.commonPool-worker-23]
forEach: A2 [ForkJoinPool.commonPool-worker-19]
forEach: A1 [ForkJoinPool.commonPool-worker-9]
map: b1 [main]
forEach: B1 [main]
* */