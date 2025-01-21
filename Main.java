import java.util.Random;
import java.util.HashSet;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Player[] players = ArrayOfPlayers();
            System.out.println("Array " + (i + 1) + ": " + Arrays.toString(players));
        }
    }

    public static Player[] ArrayOfPlayers() {
        Random random = new Random();
        Player[] players = new Player[10];
        HashSet<String> names = new HashSet<>(); // To ensure unique names

        for (int i = 0; i < players.length; i++) {
            String name;
            do {
                name = "Player" + (random.nextInt(1000, 9999) + 1); // Generate unique names
            } while (names.contains(name));

            names.add(name);
            int score = random.nextInt(100, 999) + 1; // Generate scores between 1 and 100
            players[i] = new Player(name, score);
        }
        return players;
    }
}

class Player {
    private String name;
    private int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "{" + name + " - " + score + "}";
    }
}

