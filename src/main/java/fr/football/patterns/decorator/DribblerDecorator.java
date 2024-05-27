package fr.football.patterns.decorator;

public class DribblerDecorator extends PlayerDecorator{

    public DribblerDecorator(Player player) {
        super(player);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Dribbler";
    }

    @Override
    public int getSkillLevel() {
        return super.getSkillLevel() + 15;
    }
}
