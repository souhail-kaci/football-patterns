package fr.football.patterns.observer;

public interface ObservableMatch {
    void addObserver(MatchObserver observer);
    void addObservers(MatchObserver ...observer);
    void removeObserver(MatchObserver observer);
    void notify(String message);
}
