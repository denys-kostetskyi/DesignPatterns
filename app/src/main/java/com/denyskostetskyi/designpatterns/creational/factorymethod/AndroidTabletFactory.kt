package com.denyskostetskyi.designpatterns.creational.factorymethod

import com.denyskostetskyi.designpatterns.common.device.AndroidTablet

class AndroidTabletFactory : TabletFactory() {
    override fun createTablet() = AndroidTablet()
}
