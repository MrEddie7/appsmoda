package com.example.appmoda

import android.app.Application
import com.google.firebase.FirebaseApp

class AppmodaApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Firebase is automatically initialized by the google-services plugin.
        // If you need custom initialization, you can do it here.
    }
}
