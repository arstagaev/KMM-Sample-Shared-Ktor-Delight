package com.arstagaev.testkmm9.android

import android.app.Application
import com.arstagaev.testkmm9.core.di.initKoin
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext

class AppAndroid: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin(
            enableNetworkLogs = BuildConfig.DEBUG
        ) {
            androidContext(applicationContext)
        }
    }
}