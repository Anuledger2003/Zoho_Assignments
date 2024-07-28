package assignment8;

public class TeamDTO {
    String name;
    String city;
    String division;
    PlayerDTO[] players; // has-a relationship

    public void playGame() {
        System.out.println("Team " + name + " is playing a game.");
        if (players != null) {
            for (PlayerDTO player : players) {
                player.playGame();
            }
        }
    }

    public void hireCoach() {
        System.out.println("Team " + name + " is hiring a coach.");
    }

    public static void main(String[] args) {
        PlayerDTO player1 = new PlayerDTO();
        player1.name = "Anu";
        player1.position = "Forward";
        player1.jerseyNumber = 10;

        PlayerDTO player2 = new PlayerDTO();
        player2.name = "Roshini";
        player2.position = "Goalkeeper";
        player2.jerseyNumber = 1;

        TeamDTO team = new TeamDTO();
        team.name = "Dream Team";
        team.city = "Dream City";
        team.division = "Division A";
        team.players = new PlayerDTO[]{player1, player2};

        team.playGame();
        team.hireCoach();
    }
}

