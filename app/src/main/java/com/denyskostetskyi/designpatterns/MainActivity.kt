package com.denyskostetskyi.designpatterns

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.denyskostetskyi.designpatterns.behavioral.chainofresponsibility.ChainOfResponsibilityDemo
import com.denyskostetskyi.designpatterns.creational.abstractfactory.AbstractFactoryDemo
import com.denyskostetskyi.designpatterns.common.device.DeviceOs
import com.denyskostetskyi.designpatterns.creational.builder.BuilderDemo
import com.denyskostetskyi.designpatterns.creational.factorymethod.FactoryMethodDemo
import com.denyskostetskyi.designpatterns.structural.decorator.DecoratorDemo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        runPatterns()
    }

    private fun runPatterns() {
        AbstractFactoryDemo.run(DeviceOs.ANDROID)
        FactoryMethodDemo.run(DeviceOs.ANDROID)
        BuilderDemo.run()
        DecoratorDemo.run()
        ChainOfResponsibilityDemo.run()
    }
}