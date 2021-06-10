import javax.xml.transform.Source;
import java.awt.*;
import java.util.Scanner;

public class Main {
    Player player;

    public void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Hero of Dungeon!");
        System.out.println("Please write your name before you start the game...");
        String playerName = scanner.nextLine();
        player = new Player(playerName);

    }

}
