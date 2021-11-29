package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Nhập chuỗi: ");
//        String str = sc.nextLine();
        String str = "bn1da60d47";

//        int cnt = 0;
//        int mul = 1;
//        int sum = 0;
//        for(int i=0; i<str.length(); i++) {
////            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {}
//            if(Character.isDigit(str.charAt(i))) {
//                cnt++;
//                sum += Character.getNumericValue(str.charAt(i));
////                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
//            }
//        }
//
//        for(int i=0; i<str.length(); i++) {
//            if(Character.isDigit(str.charAt(i))) {
//                int x = Character.getNumericValue(str.charAt(i));
//                if(x != 0 && sum % x == 0) {
//                    mul *= x;
//                }
//            }
//        }
//
//        System.out.println("Số: " + cnt);
//        System.out.println("Tích: " + mul);

        ArrayList<Integer> nums = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                int x = Character.getNumericValue(str.charAt(i));
                nums.add(x);
                sum += x;
            }
        }

        int mul = 1;
//        for(int i=0; i<nums.size(); i++) {
//            if(nums.get(i) != 0 && sum % nums.get(i) == 0) {
//                mul *= nums.get(i);
//            }
//        }

        for(Integer i : nums) {
            if(i != 0 && sum % i == 0) {
                mul *= i;
            }
        }

        System.out.println("Số: " + nums.size());
        System.out.println("Tích: " + mul);
    }
}
