package Play;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Dice die1 = new Dice();
        Dice die2 = new Dice();

        Scanner rafle = new Scanner(System.in);
        System.out.println("SHAKE RAFFLE CUP \nby typing >>roll<<");

        while (true) {
            String s = rafle.nextLine();
            if (s.equalsIgnoreCase("roll")) {
                die1.rollDice();
                die2.rollDice();

                System.out.println(die1.getFaceValue());
                System.out.println(die2.getFaceValue());
            } else {
                System.out.println(":( plz");
            }

            if (die1.getFaceValue() == die2.getFaceValue()) {
                System.out.println("Point");
            }

        }
    }
}
