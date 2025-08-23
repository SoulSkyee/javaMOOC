
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String iFile = scan.nextLine();

        System.out.println("Team:");
        String searchTeam = scan.nextLine();

        int games = 0;
        int win = 0;
        int lose = 0;

        try (Scanner scanFile = new Scanner(Paths.get(iFile))){
            while (scanFile.hasNextLine()) {
                String row = scanFile.nextLine();

                String[] split = row.split(",");

                String homeTeam = split[0];
                String awayTeam = split[1];
                int homeScore = Integer.parseInt(split[2]);
                int awayScore = Integer.parseInt(split[3]);

                if (searchTeam.equals(homeTeam)) {
                    if (homeScore > awayScore) {
                        win++;
                    }

                    if (homeScore < awayScore) {
                        lose++;
                    }

                    games++;
                }

                if (searchTeam.equals(awayTeam)) {
                    if (awayScore > homeScore) {
                        win++;
                    }

                    if (awayScore < homeScore) {
                        lose++;
                    }

                    games++;
                }

                

            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);
    }

}
