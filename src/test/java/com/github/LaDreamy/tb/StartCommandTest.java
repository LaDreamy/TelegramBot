package com.github.LaDreamy.tb;

import com.github.LaDreamy.tb.command.Command;
import com.github.LaDreamy.tb.command.StartCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.LaDreamy.tb.command.CommandName.START;
import static com.github.LaDreamy.tb.command.StartCommand.START_MESSAGE;

@DisplayName("Testing for StartCommand")
public class StartCommandTest extends AbstractCommandTest{
    @Override
    String getCommandName() {
        return START.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return START_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StartCommand(sendBotMessageService);
    }
}
