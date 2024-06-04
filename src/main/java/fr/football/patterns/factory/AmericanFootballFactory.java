package fr.football.patterns.factory;

public class AmericanFootballFactory implements FootballFactory {
    @Override
    public Player createPlayer() {
        return new AmericanPlayer();
    }

    @Override
    public Coach createCoach() {
        return new AmericanCoach();
    }
}
