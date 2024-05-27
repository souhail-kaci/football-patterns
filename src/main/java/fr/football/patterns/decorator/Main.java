package fr.football.patterns.decorator;

public class Main {

    public static void main(String[] args) {

        Player player = new BasicPlayer("soso",50);

        player = new DribblerDecorator(player);

        player = new FreeKickSpecialistDecorator(player);

        System.out.println(player.getDescription()+", with total skills of :"+player.getSkillLevel());

    }
}
