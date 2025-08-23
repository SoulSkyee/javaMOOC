
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<>();
        while (true) {
            String input = sc.nextLine();
            if (input.equals("")) {
                break;
            }
            name.add(input);
        }

        System.out.println(name.get(2));
    }
}
