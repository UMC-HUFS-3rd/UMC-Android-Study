package umc.hufs.newsapplication

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
 * NewsApplication
 * @author jaesung
 * @created 2022/11/06
 * @desc
 */

@HiltAndroidApp
class NewsApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initTimber()
    }

    private fun initTimber() {
        Timber.plant(Timber.DebugTree())
    }
}