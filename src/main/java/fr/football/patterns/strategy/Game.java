package fr.football.patterns.strategy;

public class Game {

    public static void main(String... args) {

        //CREATE PLAYER
        var player1 = new Player("Sergio Ramos");

        var player2 = new Player("Lionel Messi");

        //CREATE STRATEGY

        player1.applyCoachStrategy(new DefenseStrategy());

        player2.applyCoachStrategy(new AttackStrategy());

    }
}
