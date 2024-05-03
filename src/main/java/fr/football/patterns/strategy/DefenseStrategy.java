package fr.football.patterns.strategy;

public class DefenseStrategy implements GameStrategy {
    @Override
    public void applyStrategy(String name) {
        System.out.printf("%s, Apply Defense Strategy\n", name);
    }
}
