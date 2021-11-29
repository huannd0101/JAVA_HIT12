package bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RunMain {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        int choose = 0;

        do {
            System.out.println(
                    "1) Add book (1đ)\n" +
                    "2) Edit book by id (1đ)\n" +
                    "3) Delete book by id (1đ)\n" +
                    "4) Sort books by name (ascending) (1đ)\n" +
                    "5) Sort books by price (descending) (1đ)\n" +
                    "6) Show all books (1đ)\n" +
                    "7) Exit.\n");
            System.out.print("Enter your choose: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    addBook();
                    break;
                case 2:
                    editBook();
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    sortByName();
                    break;
                case 5:
                    sortByPrice();
                    break;
                case 6:
                    showBooks();
                    break;
                case 7:
                    System.out.println("Đã thoát :v");
                    break;
                default:
                    System.out.println("Không có lựa chọn này!");
            }
        }while(choose != 7);


    }

    private static void addBook() {
        Book book = new Book();
        book.input();
        if(isContain(book.getId())) {
            System.out.println("Duplicate id");
            return;
        }
        books.add(book);
    }

    private static void editBook() {
        if(books.isEmpty()) {
            System.out.println("List rỗng!");
            return;
        }

        System.out.print("Enter id: ");
        int id = sc.nextInt();
        if(!isContain(id)) {
            System.out.println("Không tồn tại id này");
            return;
        }
        for(int i=0; i< books.size(); i++) {
            if(books.get(i).getId() == id) {
                books.get(i).edit();
            }
        }
    }

    private static void deleteBook() {
        if(books.isEmpty()) {
            System.out.println("List rỗng!");
            return;
        }

        System.out.print("Enter id: ");
        int id = sc.nextInt();
        if(!isContain(id)) {
            System.out.println("Không tồn tại id này");
            return;
        }

        for(int i=0; i< books.size(); i++) {
            if(books.get(i).id == id) {
                books.remove(i);
                break;
            }
        }
    }

    private static void sortByName() {
        if(books.isEmpty()) {
            System.out.println("List rỗng!");
            return;
        }
        for(int i=0; i<books.size()-1; i++) {
            for(int j=books.size()-1; j>i; j--) {
                String s1 = books.get(j-1).getName();
                String s2 = books.get(j).getName();
                if(s1.compareToIgnoreCase(s2) > 0) {
                    Collections.swap(books, j-1, j);
                }
            }
        }
    }

    private static void sortByPrice() {
        if(books.isEmpty()) {
            System.out.println("List rỗng!");
            return;
        }
        for(int i=0; i<books.size()-1; i++) {
            for(int j=books.size()-1; j>i; j--) {
                if(books.get(j-1).getPrice() < books.get(j).getPrice()) {
                    Book book = books.get(j-1);
                    books.set(j-1, books.get(j));
                    books.set(j, book);
                }
            }
        }
    }

    private static void showBooks() {
        if(books.isEmpty()) {
            System.out.println("List rỗng!");
            return;
        }

        System.out.printf("%-15s | %-20s | %-20s | %-15s | %-15s | %-20s\n", "ID", "Name", "Publisher", "Price", "Number of page", "Author");
        books.forEach(Book::output);

//        for(int i=0; i<books.size(); i++ ) {
//            books.get(i).output();
//        }

//        for(Book book : books) {
//            book.output();
//        }
    }

    private static boolean isContain(int id) {
        for(Book book : books) {
            if(book.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
