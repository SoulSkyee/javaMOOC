
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String nameOfTheOldest = "";
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] split = input.split(",");
            int age = Integer.parseInt(split[1]);
            if (age > oldest) {
                oldest = age;
                nameOfTheOldest = split[0];
            }
        } 

        System.out.println("Name of the oldest: " + nameOfTheOldest);

    }
}
