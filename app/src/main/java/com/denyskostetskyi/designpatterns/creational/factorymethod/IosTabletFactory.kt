package com.denyskostetskyi.designpatterns.creational.factorymethod

import com.denyskostetskyi.designpatterns.common.device.IosTablet

class IosTabletFactory : TabletFactory() {
    override fun createTablet() = IosTablet()
}
