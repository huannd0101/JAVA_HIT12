package bai2;

import java.util.ArrayList;
import java.util.List;

public class RunMain {
    public static void main(String[] args) {
//        IShape[] shapes = new IShape[3];
//        shapes[0] = new Rectangle(3.4, 5.3);
//        shapes[1] = new Circle(5.5);
//        shapes[2] = new Rectangle(7.4, 4.3);
//
//        for(int i = 0; i < 3; i++){
//            System.out.println("Area of shapes[" + i + "]: " + shapes[i].getArea());
//            System.out.println("Perimeter of shapes[" + i + "]: " + shapes[i].getPerimeter());
//            System.out.println("");
//        }
        List<IShape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(3.4, 5.3));
        shapes.add(new Circle(5.5));
        shapes.add(new Rectangle(7.4, 4.3));

        for(int i=0; i< shapes.size(); i++) {
            System.out.println("Area of shapes[" + i + "]: " + shapes.get(i).getArea());
            System.out.println("Perimeter of shapes[" + i + "]: " + shapes.get(i).getPerimeter());
            System.out.println("");
        }
    }
}
