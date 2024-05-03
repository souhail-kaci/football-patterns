package fr.football.patterns.strategy;

public class AttackStrategy implements GameStrategy {
    @Override
    public void applyStrategy(String name) {
        System.out.printf("%s, Applying attack strategy => Goal...", name);
    }
}
