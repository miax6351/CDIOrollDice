package Play;
import gui_fields.GUI_Field;
import gui_main.GUI;
import java.awt.*;
import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Dice die1 = new Dice();
        Dice die2 = new Dice();

        //GUI
        GUI.setNull_fields_allowed(true);
        GUI_Field[] fields = new GUI_Field[40];

        GUI gui = new GUI(fields,Color.PINK);

        Scanner rafle = new Scanner(System.in);
        System.out.println("SHAKE RAFFLE CUP \nby typing >>roll<<");

        while (true) {
            String s = rafle.nextLine();
            if (s.equalsIgnoreCase("roll")) {
                die1.rollDice();
                die2.rollDice();

                System.out.println(die1.getFaceValue());
                System.out.println(die2.getFaceValue());
                gui.setDice(die1.getFaceValue(), die2.getFaceValue());
            } else {
                System.out.println(":( plz");
            }

            //if (die1.getFaceValue() == die2.getFaceValue()) {
              //  System.out.println("Point");
            //}

        }
    }
}
