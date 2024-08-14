package com.denyskostetskyi.designpatterns.creational.factorymethod

import com.denyskostetskyi.designpatterns.common.device.Tablet

abstract class TabletFactory {
    abstract fun createTablet(): Tablet

    fun testTablet(action: (tablet: Tablet) -> Unit) {
        val tablet = createTablet()
        action(tablet)
    }
}
