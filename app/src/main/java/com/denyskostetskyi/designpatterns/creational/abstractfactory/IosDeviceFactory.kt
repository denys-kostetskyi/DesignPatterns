package com.denyskostetskyi.designpatterns.creational.abstractfactory

import com.denyskostetskyi.designpatterns.common.device.IosPhone
import com.denyskostetskyi.designpatterns.common.device.IosTablet

class IosDeviceFactory : DeviceFactory {
    override fun createPhone() = IosPhone()

    override fun createTablet() = IosTablet()
}
