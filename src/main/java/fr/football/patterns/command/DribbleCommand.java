package fr.football.patterns.command;

public record DribbleCommand(Player player) implements Command {
    @Override
    public void execute() {
        player.dribble();
    }
}
