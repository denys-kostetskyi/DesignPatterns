package com.denyskostetskyi.designpatterns.structural.decorator

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class TimeStampLogger(logger: Logger) : AbstractLoggerDecorator(logger) {
    private val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault())
    private val dateTime get() = "[${dateFormat.format(Date())}]"

    override fun log(message: String) {
        super.log("$dateTime $message")
    }
}
