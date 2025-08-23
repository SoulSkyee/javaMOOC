import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int inp = Integer.parseInt(scan.nextLine());

        if (inp >= 5000 && inp < 25000) {
            System.out.println("Tax: " + (100 + (inp - 5000) * 0.08));
        } else if (inp >= 25000 && inp < 55000) {
            System.out.println("Tax: " + (1700 + (inp - 25000)* 0.10));
        } else if (inp >= 55000 && inp < 200_000) {
            System.out.println("Tax: " + (4700 + (inp - 55_000) * 0.12));
        } else if (inp >= 200000 && inp < 1000_000) {
            System.out.println("Tax: " + (22100 + (inp - 200_000) * 0.15));
        } else if (inp >= 1000_000) {
            System.out.println("Tax:" + (142100 + (inp - 1000_000) * 0.17));
        } else {
            System.out.println("No tax!");
        }
    }
}