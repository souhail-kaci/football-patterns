package fr.football.patterns.observer;

public record FootballApp(String name) implements MatchObserver {
    @Override
    public void update(String message) {
        System.out.printf("%s get notified %s\n", name, message);
    }
}
