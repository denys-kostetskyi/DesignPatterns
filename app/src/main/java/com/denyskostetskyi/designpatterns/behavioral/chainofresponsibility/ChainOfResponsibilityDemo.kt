package com.denyskostetskyi.designpatterns.behavioral.chainofresponsibility

import android.util.Log

class ChainOfResponsibilityDemo {
    companion object {
        private const val TAG = "ChainOfResponsibilityDemo"

        fun run() {
            Log.d(TAG, "Chain Of Responsibility Pattern")
            val requestHandler = RegistrationHandler().apply {
                setNext(AuthenticationHandler())
                    .setNext(ApiHandler())
            }
            val requests = listOf(
                Request.RegistrationRequest(
                    "Denys",
                    "denys@gmail.com",
                    "1234"
                ),
                Request.AuthenticationRequest(
                    "denys@gmail.com",
                    "1234"
                ),
                Request.ApiRequest("/orders")
            )
            requests.forEach { requestHandler.handle(it) }
        }
    }
}
