package com.denyskostetskyi.designpatterns.behavioral.chainofresponsibility

abstract class AbstractHandler : RequestHandler {
    private var nextHandler: RequestHandler? = null

    override fun setNext(handler: RequestHandler): RequestHandler {
        nextHandler = handler
        return handler
    }

    protected fun passToNextHandler(request: Request) {
        nextHandler?.handle(request) ?: println("There is no next handler")
    }
}
