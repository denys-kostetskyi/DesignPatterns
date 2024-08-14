package com.denyskostetskyi.designpatterns.creational.abstractfactory

import com.denyskostetskyi.designpatterns.creational.abstractfactory.device.IosPhone
import com.denyskostetskyi.designpatterns.creational.abstractfactory.device.IosTablet

class IosDeviceFactory : DeviceFactory {
    override fun createPhone() = IosPhone()

    override fun createTablet() = IosTablet()
}
