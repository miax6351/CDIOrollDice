package Play;
import gui_fields.GUI_Field;
import gui_main.GUI;
import java.awt.*;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Dice die1 = new Dice();
        Dice die2 = new Dice();

        //points to begin with, and player names
        Player p1 = new Player(0, "Pontus");
        Player p2 = new Player(0,"Halfdan");

        //GUI
       /* GUI.setNull_fields_allowed(true);
        GUI_Field[] fields = new GUI_Field[40];

        GUI gui = new GUI(fields,Color.PINK);

        */

        Scanner rafle = new Scanner(System.in);
        System.out.println("SHAKE RAFFLE CUP \nby typing >>roll<<");

        //x = 1 as player 1 begins
        int x = 1;
        //the loop continues indefinitely atm
        while (true) {
            String s = rafle.nextLine();
            switch(x) {
                case 1:
                if (s.equalsIgnoreCase("roll")) {
                    die1.rollDice();
                    die2.rollDice();

                    System.out.println(die1.getFaceValue());
                    System.out.println(die2.getFaceValue());
                    //gui.setDice(die1.getFaceValue(), die2.getFaceValue());

                    //player 1's points
                    p1.points += p1.playerPoints(die1.getFaceValue() + die2.getFaceValue());
                    System.out.println(p1.playerName + ":" + p1.points);
                    x++;
                    if (die1.getFaceValue() == die2.getFaceValue()) {
                        x = 1;
                    }
                    break;

                } else {
                    System.out.println(":( plz");
                }
                case 2:
                    if (s.equalsIgnoreCase("roll")) {
                        die1.rollDice();
                        die2.rollDice();

                        System.out.println(die1.getFaceValue());
                        System.out.println(die2.getFaceValue());
                        //gui.setDice(die1.getFaceValue(), die2.getFaceValue());

                        //player 2's points
                        p2.points += p2.playerPoints(die1.getFaceValue() + die2.getFaceValue());
                        System.out.println(p2.playerName + ":" + p2.points);
                        x--;
                        if (die1.getFaceValue() == die2.getFaceValue()) {
                            x = 2;
                        }

                    } else {
                        System.out.println(":( plz");
                    }
            }



        }
    }
}
