
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int num = 0;

        try (Scanner scanFile = new Scanner(Paths.get(file))){
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();
                int angka = Integer.parseInt(row);

                if (angka >= lowerBound && angka <= upperBound ) {
                    num++;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

       System.out.println("Numbers: " + num);   
    }

}
