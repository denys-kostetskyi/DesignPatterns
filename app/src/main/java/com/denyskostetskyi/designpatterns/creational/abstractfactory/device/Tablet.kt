package com.denyskostetskyi.designpatterns.creational.abstractfactory.device

abstract class Tablet {
    abstract val name: String
    abstract val screenSize: Double

    override fun toString(): String {
        return "Tablet(name='$name', screenSize=$screenSize)"
    }
}
