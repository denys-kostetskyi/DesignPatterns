package com.denyskostetskyi.designpatterns.behavioral.chainofresponsibility

class AuthenticationHandler : AbstractHandler() {
    override fun handle(request: Request) {
        if (request is Request.AuthenticationRequest) {
            println("AuthenticationHandler handles AuthenticationRequest")
            println("Authenticated user: $request")
        } else {
            passToNextHandler(request)
        }
    }
}
