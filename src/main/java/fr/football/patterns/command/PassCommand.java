package fr.football.patterns.command;

public record PassCommand(Player player) implements Command {
    @Override
    public void execute() {
        player.passBall();
    }
}
