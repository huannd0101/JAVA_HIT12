package ex;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        /*
        * Person(name, age)
        * Student(id, year) extends Person
        * Class(name, student[])
        * Sort by age, name
        * Delete by id
        * Edit by id
        * */

        Clazz clazz = new Clazz();

        clazz.input();

        clazz.output();

        sortByAge(clazz);
        clazz.output();

        editById(clazz, 1);
        clazz.output();

        deleteById(clazz, 2);
        clazz.output();


        Scanner sc = new Scanner(System.in);

    }

    private static void sortByAge(Clazz clazz) {
        for(int i=0; i<clazz.getStudents().size()-1; i++) {
            for(int j=clazz.getStudents().size()-1; j>i; j--) {
                String name1 = clazz.getStudents().get(j-1).getName();
                String name2 = clazz.getStudents().get(j).getName();
                if(name1.compareToIgnoreCase(name2) > 0) {
                    Student s = clazz.getStudents().get(j-1);
                    clazz.getStudents().set(j-1, clazz.getStudents().get(j));
                    clazz.getStudents().set(j, s);
                }
//                if(clazz.getStudents().get(j-1).getName().compareToIgnoreCase(clazz.getStudents().get(j).getName()) > 0)
//                if(clazz.getStudents().get(j-1).getAge() > clazz.getStudents().get(j).getAge()) {
//                    Student s = clazz.getStudents().get(j-1);
//                    clazz.getStudents().set(j-1, clazz.getStudents().get(j));
//                    clazz.getStudents().set(j, s);
//                }
            }
        }
    }

    public static void deleteById(Clazz clazz, int id) {
        for(int i=0; i<clazz.getStudents().size(); i++) {
            if(clazz.getStudents().get(i).getId() == id) {
                clazz.getStudents().remove(i);
            }
        }
    }

    public static void editById(Clazz clazz, int id) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.print("Nhập tên: ");     s.setName(sc.nextLine());
        System.out.print("Nhập tuổi: ");     s.setAge(sc.nextInt());
        System.out.print("Nhập id: ");     s.setId(sc.nextInt());
        System.out.print("Nhập year: ");     s.setYear(sc.nextInt());

        for(int i=0; i<clazz.getStudents().size(); i++) {
            if(clazz.getStudents().get(i).getId() == id) {
                clazz.getStudents().set(i, s);
            }
        }
    }
}
