package bai2;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private int[] a;
    private int n;

    public Array() {
    }

    public Array(int[] a, int n) {
        this.a = a;
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n = ");
        n = sc.nextInt();
        a = new int[n];//NullPointerException
        for(int i=0; i<n; i++) {
            System.out.print("Nhập a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }

    public void show() {
        System.out.println(Arrays.toString(a));
        System.out.println();
    }

    public int sum() {
        int s = 0;
        for (int i : a) {
            s += i;
        }
        return s;
    }

    void filter(boolean flag) {
        if(flag) {
            for(int i : a) {
                if(i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }else {
            for(int i : a) {
                if(i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
    }
}
