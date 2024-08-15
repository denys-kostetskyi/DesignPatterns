package com.denyskostetskyi.designpatterns.structural.decorator

import android.util.Log

class DecoratorDemo {
    companion object {
        private const val TAG = "DecoratorDemo"

        fun run() {
            Log.d(TAG, "Decorator Pattern")
            val logger = ProcessIdLogger(TimeStampLogger(ConsoleLogger()))
            logger.log("Message from decorated logger")
        }
    }
}
