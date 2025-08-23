import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title:");
            String title = scan.nextLine();

            if (title.equals("")) {
                break;
            }

            System.out.print("Pages:");
            int pages = Integer.parseInt(scan.nextLine());

            System.out.print("Publication year:");
            int year = Integer.parseInt(scan.nextLine());

            books.add(new Book(title, pages, year));
        }

        System.out.println("What information will be printed?");
        String input = scan.nextLine();

        if (input.equals("everything")) {
            for(Book all : books){
                System.out.println(all);
            }
        }

        if (input.equals("name")) {
            for(Book all : books){
                System.out.println(all.getTitle());
            }
        }
    }
}
