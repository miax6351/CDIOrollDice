package Play;

public class Player {

    String playerName = "";
    int points = 0;
    Dice die1;
    Dice die2;

    public Player(int p, String pN, Dice d1, Dice d2){
        playerName = pN;
        points = p;
        die1 = d1;
        die2 = d2;
    }

    public int playerPoints(int points){
        return points;
    }

    public int plusPoints () {
        return die1.getFaceValue()+die2.getFaceValue();
    }

}
