package fr.football.patterns.command;

import java.util.ArrayList;
import java.util.List;

public record Coach(List<Command> commands) {

    public Coach() {
        this(new ArrayList<>());
    }

    public void setCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
