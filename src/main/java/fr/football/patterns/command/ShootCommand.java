package fr.football.patterns.command;
public record ShootCommand(Player player) implements Command {

    @Override
    public void execute() {
        player.shootGoal();
    }
}
