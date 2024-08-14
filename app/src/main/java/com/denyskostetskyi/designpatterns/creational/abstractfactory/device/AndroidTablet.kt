package com.denyskostetskyi.designpatterns.creational.abstractfactory.device

class AndroidTablet : Tablet() {
    override val name: String
        get() = "Samsung Galaxy Tab S9"
    override val screenSize: Double
        get() = 11.0
}
