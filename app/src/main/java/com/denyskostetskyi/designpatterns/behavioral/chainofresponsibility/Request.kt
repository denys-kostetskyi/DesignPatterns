package com.denyskostetskyi.designpatterns.behavioral.chainofresponsibility

sealed class Request {
    data class RegistrationRequest(val name: String, val username: String, val password: String) :
        Request()

    data class AuthenticationRequest(val username: String, val password: String) : Request()
    data class ApiRequest(val endpoint: String) : Request()
}
