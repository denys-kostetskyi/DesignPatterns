package com.denyskostetskyi.designpatterns.behavioral.chainofresponsibility

class ApiHandler : AbstractHandler() {
    override fun handle(request: Request) {
        if (request is Request.ApiRequest) {
            println("ApiHandler handles ApiRequest")
            println("Api request: $request")
        } else {
            passToNextHandler(request)
        }
    }
}
