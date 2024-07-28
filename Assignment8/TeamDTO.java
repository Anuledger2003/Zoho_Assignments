package assignment8;

import java.util.List;

public class TeamDTO {

    private String name;
    private String city;
    private String division;
    private List<PlayerDTO> players;

    public TeamDTO(String name, String city, String division, List<PlayerDTO> players) {
        this.name = name;
        this.city = city;
        this.division = division;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public List<PlayerDTO> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerDTO> players) {
        this.players = players;
    }

    public void playGame() {
        System.out.println("Team " + name + " is playing a game.");
        for (PlayerDTO player : players) {
            player.playGame();
        }
    }

    public void hireCoach() {
        System.out.println("Team " + name + " is hiring a coach.");
    }

    public static void main(String[] args) {
        PlayerDTO player1 = new PlayerDTO("Anu", "Forward", 10);
        PlayerDTO player2 = new PlayerDTO("Roshini", "Goalkeeper", 1);

        List<PlayerDTO> players = List.of(player1, player2);
        TeamDTO team = new TeamDTO("Dream Team", "Dream City", "Division A", players);

        team.playGame();
        team.hireCoach();
    }
}

