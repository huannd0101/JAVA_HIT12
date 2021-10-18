package bai2;

import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Nhap n = ");
//        int n = sc.nextInt();
//
//        if(!isPrime(n)) {
//            System.out.println(n + " là số nguyên tố");
//        }else {
//            System.out.println(n + " không là số nguyên tố");
//        }

//        System.out.println(sum(1, 5));
//        show("Bye");

//        int a = 5;
//        changeNumber(a);
//
//        System.out.println(a);

//        Student student = new Student();
//        student.id = 10;
//        student.mark = 10;
//
//        changeObject(student);
//
//        System.out.println(student.id);

        final int MY_IP = 5;
        System.out.println(MY_IP);
    }

    /*
    * i <= sqrt(a)
    * i*i <= a
    * */
    public static boolean isPrime(int a){
//        if(a < 2) return false;
        for(int i=2;i*i<=a; i++){
            if (a % i == 0) {
                return false;
            }
        }
//        return true;
        return a > 1;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void show(String s) {
        System.out.println(s);
    }

    public static void changeNumber(int n) {
        n--;
    }
    public static void changeObject(Student student) {
        student.id--;
    }

}
