package com.example.transitivedependencytest

import android.content.Intent
import androidx.car.app.Screen
import androidx.car.app.Session

class AppSession : Session() {
    override fun onCreateScreen(intent: Intent): Screen {
        return AppScreen(carContext)
    }
}