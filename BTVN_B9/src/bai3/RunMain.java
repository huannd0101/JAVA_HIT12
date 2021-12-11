package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<News> list = new ArrayList<>();



        int choise = 0;
        while(true){
            System.out.println("-------------menu--------------");
            System.out.println("\t1. Insert news");
            System.out.println("\t2. View list news");
            System.out.println("\t3. Average rate");
            System.out.println("\t4. Exit");
            System.out.println("-------------------------------");
            System.out.print("\nNhập lựa chọn của bạn: ");
            choise = sc.nextInt();
            switch(choise){
                case 1:
                    News x = new News();
                    System.out.print("Nhập id: ");
                    x.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Nhập title: ");
                    x.setTitle(sc.nextLine());
                    System.out.print("Nhập publishDate: ");
                    x.setPublishDate(sc.nextLine());
                    System.out.print("Nhập author: ");
                    x.setAuthor(sc.nextLine());
                    System.out.print("Nhập content: ");
                    x.setContent(sc.nextLine());
                    System.out.println("Nhập rates");
                    x.inputRate();
                    list.add(x);
                    break;
                case 2:
                    System.out.printf("%-15s %-20s %-20s %-20s %-20s %-15s",
                            "Id", "Title", "publishDate", "Author", "Content", "AverageRate");
                    list.forEach(News::display);
                    break;
                case 3:
                    System.out.printf("%-15s %-20s %-20s %-20s %-20s %-15s",
                            "Id", "Title", "publishDate", "Author", "Content", "AverageRate");
                    for(int i = 0; i < list.size(); i++){
                        list.get(i).calculate();
                        list.get(i).display();
                    }
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
