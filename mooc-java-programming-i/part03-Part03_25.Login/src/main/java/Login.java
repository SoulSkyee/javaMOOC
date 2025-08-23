
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String usm1 = "alex";
        String pw1 = "sunshine";

        String usm2 = "emma";
        String pw2 = "haskell";


        System.out.print("Enter username:");
        String username = scanner.nextLine();
        System.out.print("Enter password:");
        String password = scanner.nextLine();

     
        if ((username.equals(usm1) && password.equals(pw1)) ||  (username.equals(usm2) && password.equals(pw2))) {
            System.out.println("You have successfully logged in!");

        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
