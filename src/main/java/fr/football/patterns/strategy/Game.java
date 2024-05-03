package fr.football.patterns.strategy;

public class Game {

    public static void main(String... args) {

        //CREATE TEAMS
        var team1 = new Team("Barcelona");

        var team2 = new Team("Real Madrid");

        //APPLY STRATEGY

        team1.applyCoachStrategy(new DefenseStrategy());
        team2.applyCoachStrategy(new AttackStrategy());


    }
}
