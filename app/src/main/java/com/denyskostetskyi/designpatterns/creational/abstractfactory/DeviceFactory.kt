package com.denyskostetskyi.designpatterns.creational.abstractfactory

import com.denyskostetskyi.designpatterns.creational.abstractfactory.device.Phone
import com.denyskostetskyi.designpatterns.creational.abstractfactory.device.Tablet

interface DeviceFactory {
    fun createPhone(): Phone

    fun createTablet(): Tablet
}