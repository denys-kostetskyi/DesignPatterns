package com.denyskostetskyi.designpatterns.structural.decorator

class ProcessIdLogger(logger: Logger) : AbstractLoggerDecorator(logger) {
    private val processId get() = "[PID: ${android.os.Process.myPid()}]"

    override fun log(message: String) {
        super.log("$processId $message")
    }
}
