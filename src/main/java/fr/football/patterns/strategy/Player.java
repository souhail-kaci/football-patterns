package fr.football.patterns.strategy;

public record Player(String name) {
    public void applyCoachStrategy(GameStrategy gameStrategy) {
        gameStrategy.applyStrategy(name);
    }
}
