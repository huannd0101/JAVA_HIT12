package bai2;

import java.util.Scanner;

public class Document {
    protected int id;
    protected String name;
    protected String publisher;
    protected int price;

    public Document() {
    }

    public Document(int id, String name, String publisher, int price) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        this.id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter publisher: ");
        this.publisher = sc.nextLine();
        System.out.print("Enter price: ");
        this.price = sc.nextInt();
    }

    public void edit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter publisher: ");
        this.publisher = sc.nextLine();
        System.out.print("Enter price: ");
        this.price = sc.nextInt();
    }

    public void output() {
        System.out.printf("%-15d | %-20s | %-20s | %-15d | ", this.id, this.name, publisher, price);
    }


    public void read() {
        System.out.println("Document");
    }
}
