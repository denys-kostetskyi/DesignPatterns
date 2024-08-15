package com.denyskostetskyi.designpatterns.behavioral.chainofresponsibility

interface RequestHandler {
    fun setNext(handler: RequestHandler): RequestHandler
    fun handle(request: Request)
}
