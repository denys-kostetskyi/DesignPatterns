package com.denyskostetskyi.designpatterns.common.device

class AndroidTablet : Tablet() {
    override val name: String
        get() = "Samsung Galaxy Tab S9"
    override val screenSize: Double
        get() = 11.0
}
