package com.github.LaDreamy.tb;

import com.github.LaDreamy.tb.command.Command;
import com.github.LaDreamy.tb.command.StopCommand;
import org.junit.jupiter.api.DisplayName;

import static com.github.LaDreamy.tb.command.CommandName.STOP;
import static com.github.LaDreamy.tb.command.StopCommand.STOP_MESSAGE;

@DisplayName("Testing for StopCommand")
public class StopCommandTest extends AbstractCommandTest {
    @Override
    String getCommandName() {
        return STOP.getCommandName();
    }

    @Override
    String getCommandMessage() {
        return STOP_MESSAGE;
    }

    @Override
    Command getCommand() {
        return new StopCommand(sendBotMessageService);
    }
}
