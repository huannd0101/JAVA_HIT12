package bai3;

import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        exc(str);

    }

    public static void exc(String str){
        int sum = 0, cnt = 0;
        for (int i=0; i<str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
                cnt++;
            }
        }
        if (cnt != 0){
            System.out.println("True");
            System.out.println("Trung bình cộng các chữ số: " + (float)sum/cnt);
        } else {
            System.out.println("false");
            System.out.println("Trung bình cộng các chữ số: Không có chữ số trong chuỗi.");
        }
    }

}
