package fr.football.patterns.command;

public record Player(String name) {

    public void passBall() {
        System.out.println(name + " passed ball");
    }


    public void shootGoal() {
        System.out.println(name + " shoots goal");
    }


    public void dribble() {
        System.out.println(name + " dribble");
    }
}
