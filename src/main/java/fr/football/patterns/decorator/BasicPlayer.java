package fr.football.patterns.decorator;

public record BasicPlayer(String name,int skill) implements Player{

    @Override
    public String getDescription() {
        return name;
    }

    @Override
    public int getSkillLevel() {
        return skill;
    }
}
