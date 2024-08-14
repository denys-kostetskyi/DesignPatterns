package com.denyskostetskyi.designpatterns.creational.abstractfactory.device

abstract class Phone {
    abstract val name: String

    override fun toString(): String {
        return "Phone(name='$name')"
    }
}
