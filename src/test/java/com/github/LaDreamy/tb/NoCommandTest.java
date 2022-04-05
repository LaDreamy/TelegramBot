package com.github.LaDreamy.tb;

import com.github.LaDreamy.tb.command.Command;
import com.github.LaDreamy.tb.command.NoCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.LaDreamy.tb.command.CommandName.NO;
import static com.github.LaDreamy.tb.command.NoCommand.NO_MESSAGE;

@DisplayName("Testing for NoCommand")
public class NoCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return NO.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return NO_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new NoCommand(sendBotMessageService);
    }
}
