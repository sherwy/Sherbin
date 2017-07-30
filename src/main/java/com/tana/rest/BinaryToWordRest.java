package com.tana.rest;

import org.apache.log4j.Logger;
import com.linecorp.bot.model.event.MessageEvent;
import com.linecorp.bot.model.event.message.TextMessageContent;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.spring.boot.annotation.EventMapping;
import com.linecorp.bot.spring.boot.annotation.LineMessageHandler;

@LineMessageHandler
public class BinaryToWordRest {
	
	private Logger LOGGER = Logger.getLogger(BinaryToWordRest.class);
	
	@EventMapping
    public TextMessage handleTextMessageEvent(MessageEvent<TextMessageContent> event) {
		LOGGER.info("event: " + event);
        return new TextMessage(event.getMessage().getText());
    }
	
}
