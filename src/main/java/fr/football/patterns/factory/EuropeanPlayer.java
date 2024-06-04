package fr.football.patterns.factory;

public class EuropeanPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Playing in European style");
    }
}
