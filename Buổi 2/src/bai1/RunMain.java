package bai1;

import bai2.Student;

import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {

//        int[] a = {1, 2, 3, 4, 10};
//        int[][] b = new int[2][3];
//        int[][] c = {
//                {1, 2, 3},
//                {2, 3, 4}
//        };

        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.id = 0;
        student.mark = 10;

//        System.out.print("Nhap a = ");
//        int a = sc.nextInt();
//        System.out.print("Nhap s = ");
//        sc.nextLine();
//        String s = sc.nextLine();
//        System.out.println("a = " + a);
//        System.out.println("S = " + s);

        //ctrl + d: nhân đôi dòng
        //shift + alt + phím up, down: di chuyển dòng
//        this is comment: ctrl + ?
        /*
        * comment
        * comment ...
        * */
        System.out.print("Nhap n = ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Nhap a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        //tăng dần: bubble sort


//        int pos = 1;
//        for(int i=pos-1; i<n-1; i++) {
//            a[i] = a[i+1];
//        }
//        n--;
//
        sort(a, n);
        for(int i=0; i<n; i++) {
            System.out.print(a[i] + " ");
        }




    }

    public static void sort(int[] a, int n) {
        for(int i=0; i<n-1; i++){
            for(int j=n-1; j>i; j--){
                if(a[j-1] > a[j]) {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

}
