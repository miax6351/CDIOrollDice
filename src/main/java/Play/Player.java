package Play;

public class Player {

    String playerName = "";
    int points = 0;

    public Player(int p, String pN){
        playerName = pN;
        points = p;
    }

    public int playerPoints(int points){
        return points;
    }

}
