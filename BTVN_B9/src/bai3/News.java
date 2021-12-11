package bai3;

import java.util.Scanner;

public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private double averageRate;

    public News() {
    }

    public News(int id, String title, String publishDate, String author, String content, double averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public double getAverageRate() {
        return averageRate;
    }

    @Override
    public void display() {
        System.out.printf("%-15d %-20s %-20s %-20s %-20s %-15.2f",
                getId(), getTitle(), getPublishDate(), getAuthor(), getContent(), getAverageRate());
    }

    public int []rateList = new int[3];

    public void inputRate(){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            System.out.print("Nhập rate thứ " + (i + 1) + ": ");
            rateList[i] = sc.nextInt();
        }
    }

    public void calculate(){
        int s = 0;
        for(int i = 0; i < 3; i++){
            s += rateList[i];
        }
        this.averageRate = s / 3.0;
    }
}