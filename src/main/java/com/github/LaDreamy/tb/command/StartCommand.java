package com.github.LaDreamy.tb.command;

import com.github.LaDreamy.tb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StartCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public final static String START_MESSAGE = "Hi! I am Telegram Bot. I will help you keep up to date with the latest articles by authors you are interested in. I'm young and just learning.\n"
            + "To see a list of commands type \"/help\".";

    public StartCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }
}
