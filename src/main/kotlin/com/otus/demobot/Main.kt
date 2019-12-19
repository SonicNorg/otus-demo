package com.otus.demobot

import org.apache.logging.log4j.LogManager
import org.telegram.telegrambots.ApiContextInitializer
import org.telegram.telegrambots.meta.TelegramBotsApi
import org.telegram.telegrambots.meta.exceptions.TelegramApiException

const val myBotName = ""
const val myBotToken = ""

fun main() {
    val LOGGER = LogManager.getLogger("MAIN")
    LOGGER.info("Starting bot...")
    ApiContextInitializer.init()
    val botsApi = TelegramBotsApi()
    try {
        botsApi.registerBot(DemoBot())
    } catch (e: TelegramApiException) {
        LOGGER.error("Failed to start", e)
        throw e
    }
    LOGGER.info("Bot started.")
}