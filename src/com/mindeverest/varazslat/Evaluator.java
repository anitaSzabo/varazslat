package com.mindeverest.varazslat;

public class Evaluator {

    public static Player calculateWinner(Player player1, Player player2) {
        if(player1.getHealth() > player2.getHealth()) {
            return player1;
        } else if (player2.getHealth() > player1.getHealth()) {
            return player2;
        } else {
            return null;
        }
    }

    public static boolean checkIfPlayerIsDead(Player player1, Player player2) {
        if(player1.getHealth() == 0 || player2.getHealth() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
