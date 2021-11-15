package Bai4;

public class RunMain {
    public static void main(String[] args) {
        Sum<Integer> sumInt = new Sum<>(1, 2);
        Sum<Long> sumLong = new Sum<>(3L, 4L);
        Sum<Float> sumFloat = new Sum<>(5.5f, 6f);
        Sum<Double> sumDouble = new Sum<>(6.0, 7.3);

        System.out.println("Tổng sumInt: " + getSumInt(sumInt));
        System.out.println("Tổng sumLong: " + getSumLong(sumLong));
        System.out.println("Tổng sumFloat: " + getSumFloat(sumFloat));
        System.out.println("Tổng sumDouble: " + getSumDouble(sumDouble));

    }

    private static Integer getSumInt(Sum<Integer> s) {
        return s.getSoA() + s.getSoB();
    }
    private static Long getSumLong(Sum<Long> s) {
        return s.getSoA() + s.getSoB();
    }
    private static Float getSumFloat(Sum<Float> s) {
        return s.getSoA() + s.getSoB();
    }
    private static Double getSumDouble(Sum<Double> s) {
        return s.getSoA() + s.getSoB();
    }
}
