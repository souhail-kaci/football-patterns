package fr.football.patterns.factory;

public class EuropeanCoach implements Coach {
    @Override
    public void coach() {
        System.out.println("Coaching in European style");
    }
}
