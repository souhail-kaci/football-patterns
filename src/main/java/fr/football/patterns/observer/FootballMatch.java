package fr.football.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class FootballMatch implements ObservableMatch {
    private final List<MatchObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(MatchObserver observer) {
        observers.add(observer);
    }

    @Override
    public void addObservers(MatchObserver... observer) {
        for (MatchObserver o : observer) {
            this.addObserver(o);
        }
    }

    @Override
    public void removeObserver(MatchObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (MatchObserver observer : observers) {
            observer.update(message);
        }
    }
}
