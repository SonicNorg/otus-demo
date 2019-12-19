package com.otus.demobot

import org.telegram.abilitybots.api.util.AbilityUtils.getChatId
import org.telegram.telegrambots.bots.TelegramLongPollingBot
import org.telegram.telegrambots.meta.api.methods.send.SendMessage
import org.telegram.telegrambots.meta.api.objects.Update

class DemoBot : TelegramLongPollingBot() {
    override fun onUpdateReceived(update: Update?) {
//TODO Реализуйте здесь код создания и отправки сообщения, инструкция тут: http://wiki.nepavel.name/otus:demo
        TODO("Bot is not implemented yet!")
    }

    override fun getBotUsername(): String = myBotName

    override fun getBotToken(): String = myBotToken
}