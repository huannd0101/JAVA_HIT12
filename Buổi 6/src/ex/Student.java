package ex;

public class Student extends Person {
    private int id;
    private int year;

    public Student() {
    }

    public Student(String name, int age, int id, int year) {
        super(name, age);
        this.id = id;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
