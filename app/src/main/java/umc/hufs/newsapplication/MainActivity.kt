package umc.hufs.newsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import umc.hufs.newsapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        initBottomNavigation()
    }

    private fun initBottomNavigation() {
        supportFragmentManager
            .beginTransaction()
            .replace(viewBinding.frameLayout.id, FragmentTopnews())
            .commitAllowingStateLoss()

        viewBinding.bottomNavigationView.setOnItemSelectedListener{ item ->
            when (item.itemId) {
                R.id.menu_top_news -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(viewBinding.frameLayout.id, FragmentTopnews())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                R.id.menu_categories -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(viewBinding.frameLayout.id, FragmentCategories())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }

                else -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(viewBinding.frameLayout.id, FragmentSaved())
                        .commitAllowingStateLoss()
                    return@setOnItemSelectedListener true
                }
            }
        }
    }
}