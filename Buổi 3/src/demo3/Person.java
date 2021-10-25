package demo3;

import java.util.Arrays;

public class Person {
    public static int cnt = 0;
    public static String School = "DHCNHN";
    private String name;
    private int age;
    private int[] a;

    static {
        System.out.println("Khối static");
    }

    public static void change() {
        School = "Đại học công nghiệp Hà Nội";
    }

    public Person() {
        cnt++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Public static void với public void khác nhau chỗ nào vậy anh
    public void diHoc() {
        System.out.println(name + " đang đi học");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void ngonNgu() {
        System.out.println("Nói tiếng việt");
    }

    //eclipse: shift alt s
    //intel: alt insert
}
