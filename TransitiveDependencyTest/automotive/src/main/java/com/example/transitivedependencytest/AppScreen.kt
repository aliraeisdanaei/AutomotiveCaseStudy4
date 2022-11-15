package com.example.transitivedependencytest

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.*
import androidx.core.graphics.drawable.IconCompat

class AppScreen(carContext: CarContext) : Screen(carContext) {
    override fun onGetTemplate(): Template {
        val row: Row = Row.Builder().setTitle("Hello World!").build()

        return PaneTemplate.Builder(
            Pane.Builder()
                .addRow(row)
                .build()
        ).setHeaderAction(Action.APP_ICON).build()
    }
}