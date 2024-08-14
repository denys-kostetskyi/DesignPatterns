package com.denyskostetskyi.designpatterns.creational.abstractfactory.device

class AndroidPhone : Phone() {
    override val name: String
        get() = "Google Pixel 9 Pro"
}
