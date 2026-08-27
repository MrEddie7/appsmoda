package com.example.appmoda

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions

class AppmodaApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        
        // Ajuste da conexao Firebase: Garantindo a inicializacao correta com os parametros do google-services.json
        val options = FirebaseOptions.Builder()
            .setApplicationId("1:78997111233:android:da9eedf49128c6f7732f40")
            .setApiKey("AIzaSyDlxx2iMTMz_77krS4QsTByiDT0hoIU_Mg")
            .setProjectId("appmoda-1c8c5")
            .setStorageBucket("appmoda-1c8c5.firebasestorage.app")
            .build()

        if (FirebaseApp.getApps(this).isEmpty()) {
            FirebaseApp.initializeApp(this, options)
        }
    }
}
