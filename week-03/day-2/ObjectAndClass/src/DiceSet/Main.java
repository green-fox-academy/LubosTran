package DiceSet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // You have a `DiceSet` class which has a list for 6 dice
        // You can roll all of them with roll()
        // Check the current rolled numbers with getCurrent()
        // You can reroll with reroll()
        // Your task is to roll the dice until all of the dice are 6

        DiceSet diceSet = new DiceSet();
        diceSet.roll();
        for(int eachDice = 0; eachDice<6; eachDice++) {
            while (diceSet.getCurrent(eachDice) < 6) {
                diceSet.reroll(eachDice);
            }
        }
        //while (diceSet.getCurrent(1)<6){
        //    diceSet.reroll(1);}
        //while (diceSet.getCurrent(2)<6){
        //    diceSet.reroll(2);}
        //while (diceSet.getCurrent(3)<6){
        //    diceSet.reroll(3);}
        //while (diceSet.getCurrent(4)<6){
        //    diceSet.reroll(4);}
        //while (diceSet.getCurrent(5)<6){
        //    diceSet.reroll(5);}

        System.out.println(diceSet.getCurrent());

        //System.out.println(diceSet.getCurrent());
        //System.out.println(diceSet.roll());
        //System.out.println(diceSet.getCurrent());
        //System.out.println(diceSet.getCurrent(5));
        //diceSet.reroll();
        //System.out.println(diceSet.getCurrent());
        //diceSet.reroll(2);
        //System.out.println(diceSet.getCurrent());
    }
}
