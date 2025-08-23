
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");

        String iName = scanner.nextLine();

        try (Scanner scanFile = new Scanner(Paths.get(iName))){
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();
                
                // split string
                String[] split = row.split(",");

                String name = split[0];
                int age = Integer.parseInt(split[1]);

                System.out.println(name + ", " + "age: " + age + " years");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

    }
}
