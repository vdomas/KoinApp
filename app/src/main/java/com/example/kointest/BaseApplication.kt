package com.example.kointest

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            // use AndroidLogger as Koin Logger
            androidLogger(Level.DEBUG)

            // use the Android context given there
            androidContext(this@BaseApplication)
        }
    }
}