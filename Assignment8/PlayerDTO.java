package assignment8;

public class PlayerDTO {
    String name;
    String position;
    int jerseyNumber;

    public void playGame() {
        System.out.println(name + " is playing in position " + position + ".");
    }

    public void train() {
        System.out.println(name + " is training.");
    }

    public static void main(String[] args) {
        PlayerDTO player1 = new PlayerDTO();
        player1.name = "Anu";
        player1.position = "Forward";
        player1.jerseyNumber = 10;

        player1.playGame();
        player1.train();
    }
}

