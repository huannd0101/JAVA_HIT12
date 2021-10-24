package bai4;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();

        System.out.println(exc(str));
    }

    public static String exc(String str) {
        //xóa số
        for(int i=0; i<str.length(); i++) {
            while(Character.isDigit(str.charAt(i))) {
                str = str.replace(String.valueOf(str.charAt(i)), "");
            }
        }

        //xóa khoảng trắng thừa : 2 cách dùng cách nào cx đc hết
        str = str.trim();
        while (str.contains("  ")){
            str = str.replaceAll("  ", " ");
        }
//        str = str.replaceAll("//s+", " ");

        str = str.toLowerCase();

        String[] a = str.split(" ");
        str = "";

        for (int i = 0; i < a.length; i++){
            str += String.valueOf(a[i].charAt(0)).toUpperCase() + a[i].substring(1);
            if (i < a.length - 1){
                str += " ";
            }
        }

        return str;
    }

}
