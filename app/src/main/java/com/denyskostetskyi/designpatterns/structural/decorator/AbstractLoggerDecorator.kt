package com.denyskostetskyi.designpatterns.structural.decorator

abstract class AbstractLoggerDecorator(private val logger: Logger) : Logger {
    override fun log(message: String) {
        logger.log(message)
    }
}
