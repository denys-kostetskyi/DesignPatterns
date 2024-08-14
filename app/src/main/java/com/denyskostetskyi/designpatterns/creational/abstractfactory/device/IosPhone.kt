package com.denyskostetskyi.designpatterns.creational.abstractfactory.device

class IosPhone : Phone() {
    override val name: String
        get() = "Apple iPhone 15 Pro"
}
