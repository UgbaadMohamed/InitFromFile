import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Player {
    private int highscore;
    private String mapName;
    private String playerName ="Dit navn";
    private int playerScore = 1843;
    private int playerCoorX = 14;
    private int playerCoorY = 34;

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getPlayerCoorX() {
        return playerCoorX;
    }

    public int getPlayerCoorY() {
        return playerCoorY;
    }

    public int getHighscore () {
        return highscore;
    }
    public String getMapName () {
        return mapName;
    }

    public void initAttributes() {
        try {
            Scanner fileScanner = new Scanner(new File("init.ini"));
            while (fileScanner.hasNextLine()) {
                Scanner playerScanner = new Scanner(fileScanner.nextLine()).useDelimiter("=");
                String key = playerScanner.next().toLowerCase();
              switch (key) {
                  case "highscore" -> highscore = playerScanner.nextInt();

                  case "mapname" -> mapName = playerScanner.next();

                  case "playerName" -> playerName = playerScanner.next();

                  case "playerscore" -> playerScore = playerScanner.nextInt();

                  case "playercoorx" -> playerCoorX = playerScanner.nextInt();

                  case "playercoory" -> playerCoorY = playerScanner.nextInt();
              }
            }
            fileScanner.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printAttributes() {
        System.out.println("\nGame");
        System.out.println("Highscore          " + getHighscore());
        System.out.println("Mapname            " + getMapName());
        System.out.println("\nPlayer");
        System.out.println("Playername:        " + getPlayerName());
        System.out.println("Playerscore:       " + getPlayerScore());
        System.out.println("Coordinate X       " + getPlayerCoorX());
        System.out.println("Coordinate Y       " + getPlayerCoorY());

    }

}
