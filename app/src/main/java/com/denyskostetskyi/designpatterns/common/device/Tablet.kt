package com.denyskostetskyi.designpatterns.common.device

abstract class Tablet {
    abstract val name: String
    abstract val screenSize: Double

    override fun toString(): String {
        return "Tablet(name='$name', screenSize=$screenSize)"
    }
}
