package demo2;

public class RunMain {
    //các access modifier, getter, setter đố bạn nào biết là tính chất gì

    public static void main(String[] args) {
//        Car carA = new Car();
//        Car carB = new Car();
//
//        carA.tenXe = "Xe A";
//        carB.tenXe = "Xe B";
//
//        System.out.println("Name: " + carA.tenXe);
//
//        carA.diThang();
//        carB.diLui();

        //strl + p
        Car carA = new Car("Xe a", "Màu đỏ");
        Car carB = new Car();

        carA.setSoBanhXe(5);

        System.out.println(carA.getSoBanhXe());

        System.out.println(carA);
    }
}
