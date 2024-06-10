package fr.football.patterns.command;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("John");
        Player player2 = new Player("Mike");

        Command pass = new PassCommand(player1);
        Command shoot = new ShootCommand(player2);
        Command dribble = new DribbleCommand(player1);

        Coach coach = new Coach();
        coach.setCommand(pass);
        coach.setCommand(dribble);
        coach.setCommand(shoot);

        coach.executeCommands();
    }
}
