package fr.football.patterns.decorator;

public abstract class PlayerDecorator implements Player {

    private final Player player;

    public PlayerDecorator(Player player) {
        this.player = player;
    }

    @Override
    public String getDescription() {
        return player.getDescription();
    }

    @Override
    public int getSkillLevel() {
        return player.getSkillLevel();
    }
}
