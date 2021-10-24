package bai2;

import java.util.Arrays;
import java.util.Scanner;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    static int[] a;
    static int n = 0;

    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        int choose;
        do{
            System.out.println("----------------------Menu----------------------");
            System.out.println("1. Tạo và nhập mảng với n só nguyên.");
            System.out.println("2. Hiển thị mảng vừa tạo.");
            System.out.println("3. Thêm một phần tử vào vị trí k bất kỳ.");
            System.out.println("4. Xóa một phần tử tại vị trí k bất kỳ.");
            System.out.println("5. Đảo ngược mảng.");
            System.out.println("6. Hiển thị phần tử a[1] và các số chia hết cho a[1].");
            System.out.println("7. Xuất ra màn hình tổng các số nguyên tố có trong mảng.");
            System.out.println("8. Thoát.");
            System.out.println("------------------------------------------------");

            System.out.print("Mời bạn lựa chọn: ");
            choose = sc.nextInt();
            switch (choose){
                case 1 :
                    input();
                    break;
                case 2:
                    output();
                    break;
                case 3:
                    insert();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    reverse();
                    break;
                case 6:
                    showElement();
                    break;
                case 7:
                    showSumOfPrime();
                    break;
                case 8:
                    System.out.println("Chương trình kết thúc");
                    break;
                default:
                    System.out.println("Lựa chọn không tồn tại!!!");
            }
        } while (choose != 8);
    }

    private static void input() {
        System.out.print("Nhập n: " );
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Nhập a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }

    private static void output() {
        if (n > 0){
            System.out.print("Mảng a: ");
            for (int i=0; i<n; i++){
                System.out.print(a[i] + " ");
            }
        }else {
            System.out.println("Mảng rỗng, yêu cầu nhập mảng.");
        }
        System.out.println();
    }

    private static void insert() {
        if (n > 0){
            a = Arrays.copyOf(a, n+1);
            System.out.print("Nhập vị trí cần chèn: ");
            int pos = sc.nextInt();
            System.out.print("Nhập phần tử cần chèn: ");
            int val = sc.nextInt();

            if(pos < 1 || pos > n) {
                System.out.println("Không thể chèn tại vị trí này");
            }else {
                for (int i=n; i>=pos; i--){
                    a[i] = a[i-1];
                }
                a[pos-1] = val;
                n++;
            }

            output();
        }else {
            System.out.println("Mảng rỗng, yêu cầu nhập mảng.");
        }

    }

    private static void delete() {
        if (n > 0){
            System.out.print("Nhập vị trí cần xóa: ");
            int k = sc.nextInt();
            for (int i=k-1; i<n-1; i++){
                a[i] = a[i+1];
            }
            n--;

            output();
        }else {
            System.out.println("Mảng rỗng, yêu cầu nhập mảng.");
        }
    }

    private static void reverse() {
        if (n > 0){
            for (int i = n-1; i >= 0; i--){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }else {
            System.out.println("Mảng rỗng, yêu cầu nhập mảng.");
        }
    }

    private static void showElement() {
        if (n > 0){
            System.out.println("Phần tử a[1] là : " + a[1]);
            System.out.print("Các phần tử chia hết cho a[1]: ");
            for (int i=0; i<n; i++){
                if (a[i] % a[1] == 0){
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }else {
            System.out.println("Mảng rỗng, yêu cầu nhập mảng.");
        }
    }

    public static boolean isPrime(int n){
        for (int i=2; i*i<=n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
    private static void showSumOfPrime() {
        if (n > 0){
            int sum = 0;
            for (int i = 0; i < n; i++){
                if (isPrime(a[i])){
                    sum += a[i];
                }
            }
            System.out.println("Tổng các số nguyên tố: " + sum);
        }else {
            System.out.println("Mảng rỗng, yêu cầu nhập mảng.");
        }
    }


}
