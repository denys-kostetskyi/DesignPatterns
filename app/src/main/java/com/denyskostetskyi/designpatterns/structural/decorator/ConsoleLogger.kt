package com.denyskostetskyi.designpatterns.structural.decorator

class ConsoleLogger : Logger {
    override fun log(message: String) {
        println(message)
    }
}
