package bai2;

public class RunMain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();
        System.out.println("Nhập thông tin cho arr1: ");
        arr1.inputData();
        System.out.println("Nhập thông tin cho arr2: ");
        arr2.inputData();

        System.out.print("Các phần tử mảng arr1: ");
        arr1.show();
        System.out.print("Các phần tử mảng arr2: ");
        arr2.show();

        System.out.print("Filter arr1: ");
        arr1.filter(Math.round(Math.random()) == 0);
        System.out.print("Filter arr2: ");
        arr2.filter(Math.round(Math.random()) == 0);

        double ave1 = 1.0 * arr1.sum() / arr1.getN();
        double ave2 = 1.0 * arr2.sum() / arr2.getN();

        if(ave1 > ave2) {
            System.out.println("Trung bình cộng arr1 > arr2");
        }else if(ave1 < ave2){
            System.out.println("Trung bình cộng arr1 < arr2");
        }else {
            System.out.println("Bye");
        }
    }
}
