package com.denyskostetskyi.designpatterns.creational.builder

import android.util.Log

class BuilderDemo {
    companion object {
        private const val TAG = "BuilderDemo"

        fun run() {
            Log.d(TAG, "Builder Pattern")
            val databaseConnection = DatabaseConnection.Builder()
                .database("users")
                .port(4466)
                .user("denys")
                .password("123456")
                .build()
            Log.d(TAG, databaseConnection.result)
        }
    }
}