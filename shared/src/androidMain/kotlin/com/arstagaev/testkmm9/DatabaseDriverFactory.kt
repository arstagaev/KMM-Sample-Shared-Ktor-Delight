package com.arstagaev.testkmm9

import android.content.Context
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.android.AndroidSqliteDriver

//actual class DatabaseDriverFactory(private val context: Context) {
//    actual fun createDriver(): SqlDriver {
//        return AndroidSqliteDriver(AppDatabase.Schema, context, "test.db")
//    }
//}