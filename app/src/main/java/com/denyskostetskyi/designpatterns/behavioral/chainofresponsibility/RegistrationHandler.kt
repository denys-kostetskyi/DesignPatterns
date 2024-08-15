package com.denyskostetskyi.designpatterns.behavioral.chainofresponsibility

class RegistrationHandler : AbstractHandler() {
    override fun handle(request: Request) {
        if (request is Request.RegistrationRequest) {
            println("RegistrationHandler handles RegistrationRequest")
            println("Registered user: $request")
        } else {
            passToNextHandler(request)
        }
    }
}
