package fr.football.patterns.decorator;

public class CaptainDecorator extends PlayerDecorator {
    public CaptainDecorator(Player player) {
        super(player);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Captain";
    }

    @Override
    public int getSkillLevel() {
        return super.getSkillLevel() + 5;
    }
}
