package org.xtimms.ridebus

import android.app.Application
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ProcessLifecycleOwner
import org.xtimms.ridebus.util.system.LocaleHelper
import timber.log.Timber
import uy.kohesive.injekt.Injekt

open class App : Application(), LifecycleObserver {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())

        Injekt.importModule(AppModule(this))

        LocaleHelper.updateConfiguration(this, resources.configuration)

        ProcessLifecycleOwner.get().lifecycle.addObserver(this)

    }


}