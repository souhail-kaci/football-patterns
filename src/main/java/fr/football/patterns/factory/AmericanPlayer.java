package fr.football.patterns.factory;

public class AmericanPlayer implements Player {
    @Override
    public void play() {
        System.out.println("Playing in American style");
    }
}
