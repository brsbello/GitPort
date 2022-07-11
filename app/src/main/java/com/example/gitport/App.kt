package com.example.gitport

import android.app.Application
import com.example.gitport.data.di.DataModule
import com.example.gitport.data.domain.di.DomainModule
import com.example.gitport.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}