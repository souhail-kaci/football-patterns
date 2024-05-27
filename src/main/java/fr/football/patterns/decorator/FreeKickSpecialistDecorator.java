package fr.football.patterns.decorator;

public class FreeKickSpecialistDecorator extends PlayerDecorator{
    public FreeKickSpecialistDecorator(Player player) {
        super(player);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", free kick specialist";
    }

    @Override
    public int getSkillLevel() {
        return super.getSkillLevel() + 10;
    }
}
