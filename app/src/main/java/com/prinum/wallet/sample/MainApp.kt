package com.prinum.wallet.sample

import android.app.Application
import com.google.firebase.crashlytics.FirebaseCrashlytics

class MainApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initSDK()
    }

    private fun initSDK() {
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true)
    }
}