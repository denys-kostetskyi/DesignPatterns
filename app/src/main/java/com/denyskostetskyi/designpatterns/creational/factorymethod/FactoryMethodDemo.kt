package com.denyskostetskyi.designpatterns.creational.factorymethod

import android.util.Log
import com.denyskostetskyi.designpatterns.common.device.DeviceOs

class FactoryMethodDemo {
    companion object {
        private const val TAG = "FactoryMethodDemo"

        fun run(deviceOs: DeviceOs) {
            Log.d(TAG, "Factory Method Pattern")
            val tabletFactory = when (deviceOs) {
                DeviceOs.ANDROID -> AndroidTabletFactory()
                DeviceOs.IOS -> IosTabletFactory()
            }
            tabletFactory.testTablet { tablet ->
                Log.d(TAG, "Testing $tablet")
            }
        }
    }
}
