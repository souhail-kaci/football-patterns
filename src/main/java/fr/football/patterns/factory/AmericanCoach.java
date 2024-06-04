package fr.football.patterns.factory;

public class AmericanCoach implements Coach{
    @Override
    public void coach() {
        System.out.println("Coaching in American style");
    }
}
