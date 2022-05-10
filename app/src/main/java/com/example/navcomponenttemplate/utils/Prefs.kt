package com.example.navcomponenttemplate.utils

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit

class Prefs(context: Context) {
    companion object{
        private const val KEY_SIGNED_IN = "IsSignedIn"
        private const val PREFS_FILENAME = "myPrefs"
        private const val KEY_LOGIN = "login"
        private const val KEY_PASSWORD = "passwod"
    }

    private val sharedPref: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, Context.MODE_PRIVATE)

    var isSignedIn: Boolean
        get() = sharedPref.getBoolean(KEY_SIGNED_IN, false)
        set(value) = sharedPref.edit{ putBoolean(KEY_SIGNED_IN, value)}

    var login: String?
        get() = sharedPref.getString(KEY_LOGIN, "")
        set(value) = sharedPref.edit{ putString(KEY_LOGIN, value)}

    var password: String?
        get() = sharedPref.getString(KEY_PASSWORD, "")
        set(value) = sharedPref.edit{ putString(KEY_PASSWORD, value)}
}