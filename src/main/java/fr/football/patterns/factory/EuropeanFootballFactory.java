package fr.football.patterns.factory;

public class EuropeanFootballFactory implements FootballFactory {
    @Override
    public Player createPlayer() {
        return new EuropeanPlayer();
    }

    @Override
    public Coach createCoach() {
        return new EuropeanCoach();
    }
}
