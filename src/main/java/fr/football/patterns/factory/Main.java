package fr.football.patterns.factory;

public class Main {
    public static void main(String[] args) {

        var footballFactory = new EuropeanFootballFactory();

        var europeanPlayer = footballFactory.createPlayer();

        var europeanCoach = footballFactory.createCoach();

        europeanCoach.coach();
        europeanPlayer.play();

        var americanFactory = new AmericanFootballFactory();
        var americanPlayer = americanFactory.createPlayer();
        var americanCoach = americanFactory.createCoach();

        americanPlayer.play(); // Output: Playing in American style
        americanCoach.coach(); // Output: Coaching in American style

    }
}
