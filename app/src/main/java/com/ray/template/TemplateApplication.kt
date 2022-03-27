package com.ray.template

import android.app.Application
import timber.log.Timber

class TemplateApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}