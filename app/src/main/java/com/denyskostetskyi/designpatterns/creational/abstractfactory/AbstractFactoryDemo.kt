package com.denyskostetskyi.designpatterns.creational.abstractfactory

import android.util.Log
import com.denyskostetskyi.designpatterns.common.device.DeviceOs

class AbstractFactoryDemo {
    companion object {
        private const val TAG = "AbstractFactoryDemo"

        fun run(deviceOs: DeviceOs) {
            Log.d(TAG, "Abstract Factory Pattern")
            val deviceFactory = when (deviceOs) {
                DeviceOs.ANDROID -> AndroidDeviceFactory()
                DeviceOs.IOS -> IosDeviceFactory()
            }
            val phone = deviceFactory.createPhone()
            Log.d(TAG, phone.toString())
            val tablet = deviceFactory.createTablet()
            Log.d(TAG, tablet.toString())
        }
    }
}
