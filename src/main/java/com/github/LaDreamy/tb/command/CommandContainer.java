package com.github.LaDreamy.tb.command;

import com.github.LaDreamy.tb.service.SendBotMessageService;
import com.google.common.collect.ImmutableMap;
import static com.github.LaDreamy.tb.command.CommandName.*;

public class CommandContainer {

    private final ImmutableMap<String, Command> commandMap;
    private final Command unknownCommand;

    public CommandContainer(SendBotMessageService sendBotMessageService) {
        this.commandMap = ImmutableMap.<String, Command>builder()
                .put(START.getCommandName(), new StartCommand(sendBotMessageService))
                .put(STOP.getCommandName(), new StopCommand(sendBotMessageService))
                .put(HELP.getCommandName(), new HelpCommand(sendBotMessageService))
                .put(NO.getCommandName(), new NoCommand(sendBotMessageService))
                .build();

        this.unknownCommand = new UnknownCommand(sendBotMessageService);
    }

    public Command receiveCommand(String commandIdent) {
        return commandMap.getOrDefault(commandIdent, unknownCommand);
    }
}
