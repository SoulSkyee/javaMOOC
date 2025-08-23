
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mult = 1;

        System.out.println("Give a number:");
        int input = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i <= input; i++){
            mult = mult * i;
        } 
        
        System.out.println("Factorial " + mult);
    }
}
