package bai2;

import java.util.Scanner;

public class Book extends Document {
    private int numberOfPage;
    private String author;

    public Book() {
    }

    public Book(int id, String name, String publisher, int price, int numberOfPage, String author) {
        super(id, name, publisher, price);
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of page: ");
        this.numberOfPage = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter author: ");
        this.author = sc.nextLine();
    }

    @Override
    public void edit() {
        super.edit();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of page: ");
        this.numberOfPage = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter author: ");
        this.author = sc.nextLine();
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%-15d | %-20s\n", this.numberOfPage, this.author);
    }

    //Override: Phương thức cùng tên,
    // Ghi đè nội dung
    // Phát triển thêm


    @Override
    public void read() {
        System.out.println("Book");
    }

}
