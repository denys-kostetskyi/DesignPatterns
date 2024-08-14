package com.denyskostetskyi.designpatterns.creational.abstractfactory

import com.denyskostetskyi.designpatterns.creational.abstractfactory.device.AndroidPhone
import com.denyskostetskyi.designpatterns.creational.abstractfactory.device.AndroidTablet

class AndroidDeviceFactory : DeviceFactory {
    override fun createPhone() = AndroidPhone()

    override fun createTablet() = AndroidTablet()
}
