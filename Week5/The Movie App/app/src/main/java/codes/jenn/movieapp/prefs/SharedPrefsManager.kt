package codes.jenn.movieapp.prefs

import android.content.Context
import codes.jenn.movieapp.App

class SharedPrefsManager {
  private val context = App.getAppContext()
  private val prefs = context.getSharedPreferences(MOVIES_SHARED_PREFS, Context.MODE_PRIVATE)

  fun setUserLoggedIn(isLoggedIn: Boolean) {
    prefs.edit().putBoolean(KEY_LOGGED_IN, isLoggedIn).apply()
  }

  fun isUserLoggedIn() = prefs.getBoolean(KEY_LOGGED_IN, false)
}

private const val KEY_LOGGED_IN = ""
private const val MOVIES_SHARED_PREFS = ""