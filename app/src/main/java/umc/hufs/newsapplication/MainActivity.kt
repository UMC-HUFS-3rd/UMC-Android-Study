package umc.hufs.newsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import umc.hufs.newsapplication.databinding.ActivityMainBinding
import umc.hufs.newsapplication.databinding.ActivityNewsappBinding

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
            when(item.itemId) {
                R.id.menu_top_news -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(viewBinding.frameLayout.id, FragmentTopnews)
                }
            }
        }
    }
}