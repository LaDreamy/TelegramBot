package com.github.LaDreamy.tb;

import com.github.LaDreamy.tb.bot.JavaTelegramBot;
import com.github.LaDreamy.tb.service.SendBotMessageService;
import com.github.LaDreamy.tb.service.SendBotMessageServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@DisplayName("Unit-level testing for SendBotMessageService")
public class SendBotMessageServiceTest {

    private SendBotMessageService sendBotMessageService;
    private JavaTelegramBot bot;

    @BeforeEach
    public void init() {
        bot = Mockito.mock(JavaTelegramBot.class);
        sendBotMessageService = new SendBotMessageServiceImpl(bot);
    }

    @Test
    public void shouldProperlySendMessage() throws TelegramApiException {
        String chatId = "test id";
        String message = "test message";

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);
        sendMessage.setText(message);

        sendBotMessageService.sendMessage(chatId, message);
        Mockito.verify(bot).execute(sendMessage);
    }
}
