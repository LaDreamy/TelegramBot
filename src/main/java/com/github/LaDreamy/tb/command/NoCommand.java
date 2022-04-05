package com.github.LaDreamy.tb.command;

import com.github.LaDreamy.tb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

import static com.github.LaDreamy.tb.command.CommandName.*;

public class NoCommand implements Command {
    private final SendBotMessageService sendBotMessageService;

    public final static String NO_MESSAGE = "I support commands that begin with a slash(/).\n"
            + "To see a list of commands type /help";

    public NoCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), NO_MESSAGE);
    }
}
