package com.example.navcomponenttemplate.utils

import android.app.Application

val prefs by lazy {
    Prefs(App.instance)
}

class App: Application() {
    companion object{
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}