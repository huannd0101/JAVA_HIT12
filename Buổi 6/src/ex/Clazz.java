package ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Clazz {
    private String name;
    private int n;
    private ArrayList<Student> students;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên lớp: ");     name = sc.nextLine();

        System.out.print("Nhập số lượng sinh viên: "); n = sc.nextInt();
        students = new ArrayList<>();

        for(int i=0; i<n; i++) {
            Student s = new Student();
            System.out.println("Nhập sinh viên thứ " + (i+1));
            sc.nextLine();
            System.out.print("Nhập tên: ");     s.setName(sc.nextLine());
            System.out.print("Nhập tuổi: ");     s.setAge(sc.nextInt());
            System.out.print("Nhập id: ");     s.setId(sc.nextInt());
            System.out.print("Nhập year: ");     s.setYear(sc.nextInt());
            students.add(s);
        }
    }

    public void output() {
        System.out.printf("%-20s %-20s %-20s %-20s\n", "Tên", "Tuổi", "Mã", "Năm");
//        for(int i=0; i<students.size(); i++) {
//
//        }
        students.forEach(ele ->
                System.out.printf("%-20s %-20d %-20d %-20d\n",
                        ele.getName(), ele.getAge(),
                        ele.getId(), ele.getYear())
        );
    }

    public Clazz() {
    }

    public Clazz(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


}
