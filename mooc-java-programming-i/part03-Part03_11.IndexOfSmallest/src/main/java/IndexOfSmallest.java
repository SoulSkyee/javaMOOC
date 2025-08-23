
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999

        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

       ArrayList<Integer> number = new ArrayList<>();

       while (true) {
        int input = Integer.parseInt(scanner.nextLine());
        if (input == 9999) {
            break;
        }
            number.add(input);
       }

       System.out.println("");

       int smallest = number.get(0);

       for(int i = 0; i < number.size(); i++){
        int all = number.get(i);
        if (smallest > all) {
            smallest = all;
        }

       }

       System.out.println("Smallest number: " + smallest);

       for(int i = 0; i < number.size(); i++){
        int all = number.get(i);
        if (smallest == all) {
            System.out.println("Found at index: " + i);    
        }

       }


    }
}
