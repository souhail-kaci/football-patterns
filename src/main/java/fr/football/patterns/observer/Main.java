package fr.football.patterns.observer;

public class Main {


    public static void main(String[] args) {

        var observableMatch = new FootballMatch();

        var spectator1 = new Spectator("Souhail");
        var spectator2 = new Spectator("Levi");
        var betclic = new FootballApp("Betclic");

        observableMatch.addObservers(spectator1, spectator2, betclic);


        observableMatch.notify("New Goal");

        observableMatch.notify("Yellow card");

    }
}
