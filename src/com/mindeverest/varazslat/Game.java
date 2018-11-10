package com.mindeverest.varazslat;

public class Game {

    private static final int NUM_OF_ROUNDS = 10;
    public Player player1;
    public Player player2;
    public Player attacker;
    public Player defender;

    public void createPlayers() {
        this.player1 = new Player("player1");
        this.player2 = new Player("player2");
        this.attacker = player1;
        this.defender = player2;
    }

    public void play() {
        createPlayers();
        for (int i = 0; i < NUM_OF_ROUNDS; i++) {
            if(player1.getHealth() == 0 || player2.getHealth() == 0) {
                break;
            }
            simulateRound();
            boolean isAnyDeadPlayer = Evaluator.checkIfPlayerIsDead(player1, player2);
            if(isAnyDeadPlayer) {
                break;
            }
            changeRoles();
        }
        Player winner = Evaluator.calculateWinner(player1, player2);
        if(winner == null) {
            System.out.println("It's a tie");
        } else {
            System.out.println("The winner is: " + winner.getName());
        }
    }

    private void changeRoles() {
        if(attacker == player1) {
            attacker = player2;
            defender = player1;
        } else {
            attacker = player1;
            defender = player2;
        }

    }

    private void simulateRound() {
        System.out.println("Attacker: " + attacker.getName() + ", health: " + attacker.getHealth() +
                ", defender: " + defender.getName() + ", health: " + defender.getHealth());
        Spell spell = attacker.attack(defender);
        defender.takeDamage(spell.getDamageValue());
    }

}
