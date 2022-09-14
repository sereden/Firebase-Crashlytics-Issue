package com.prinum.poc.sdk

import android.content.Context
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import com.google.firebase.crashlytics.FirebaseCrashlytics

class SomeSdk(private val context: Context) {

    private val crashlytics: FirebaseCrashlytics

    init {
        FirebaseApp.initializeApp(
            context, FirebaseOptions.Builder()
                .setApiKey("AIzaSyDuJsdu6_TZEB4qtSa1WVKSeOF6fLLgQMg")
                .setProjectId("fir-sdk-migration-test")
                .setApplicationId("1:1051572883672:android:29b6b5f2b74b122af647ad")
                .build(), "sdk2"
        )
        crashlytics = FirebaseApp.getInstance("sdk2").get(FirebaseCrashlytics::class.java)
        crashlytics.setCrashlyticsCollectionEnabled(true)
    }

    fun recordNonCriticalIssue() {
        crashlytics.recordException(IllegalStateException("Event from the SDK"))
    }
}