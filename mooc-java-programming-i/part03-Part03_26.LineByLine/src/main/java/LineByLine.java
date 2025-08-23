
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();
            String[] piece = text.split(" ");

            if (text.equals("")) {
                break;
            }

            for (int i = 0; i < piece.length; i++) {
                System.out.println(piece[i]);
            }
        }

    }
}
