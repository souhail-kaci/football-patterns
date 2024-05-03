package fr.football.patterns.strategy;

public record Team(String name) {
    public void applyCoachStrategy(GameStrategy gameStrategy) {
        gameStrategy.applyStrategy(name);
    }
}
