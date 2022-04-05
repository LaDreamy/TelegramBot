package com.github.LaDreamy.tb;

import com.github.LaDreamy.tb.command.Command;
import com.github.LaDreamy.tb.command.UnknownCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.LaDreamy.tb.command.UnknownCommand.UNKNOWN_MESSAGE;

@DisplayName("Testing for UnknownCommand")
public class UnknownCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return "/dasdasd";
    }

    @Override
    String getCommandMessage() {
        return UNKNOWN_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new UnknownCommand(sendBotMessageService);
    }
}
