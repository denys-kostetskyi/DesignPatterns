package com.denyskostetskyi.designpatterns.creational.abstractfactory

import com.denyskostetskyi.designpatterns.common.device.Phone
import com.denyskostetskyi.designpatterns.common.device.Tablet

interface DeviceFactory {
    fun createPhone(): Phone

    fun createTablet(): Tablet
}