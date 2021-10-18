package bai3;

import java.util.ArrayList;
import java.util.List;

public class RunMain {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 10};
//
//        System.out.println(a.length);

        for(int i=a.length -1; i>=0; i--) {
            System.out.println(a[i]);
        }

        for (int item : a) {
            System.out.println(item);
        }



    }
}
