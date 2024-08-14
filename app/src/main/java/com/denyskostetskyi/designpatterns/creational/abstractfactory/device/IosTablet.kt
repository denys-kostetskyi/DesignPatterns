package com.denyskostetskyi.designpatterns.creational.abstractfactory.device

class IosTablet : Tablet() {
    override val name: String
        get() = "Apple iPad Air"
    override val screenSize: Double
        get() = 10.86
}
