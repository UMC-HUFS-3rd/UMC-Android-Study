package umc.hufs.newsapplication.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import umc.hufs.newsapplication.R
import umc.hufs.newsapplication.databinding.ActivityMainBinding
import umc.hufs.newsapplication.presentation.category.CategoryFragment
import umc.hufs.newsapplication.presentation.common.base.BaseFragment
import umc.hufs.newsapplication.presentation.news.TopNewsFragment
import umc.hufs.newsapplication.presentation.save.SavedNewsFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var categoryFragment: CategoryFragment
    private lateinit var topNewsFragment: TopNewsFragment
    private lateinit var savedNewsFragment: SavedNewsFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this

        initNavigation()
        setNavigationListener()
    }

    private fun initNavigation() {
        topNewsFragment = TopNewsFragment()
        categoryFragment = CategoryFragment()
        savedNewsFragment = SavedNewsFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.fcv_main, topNewsFragment).commit()
    }

    private fun setNavigationListener() {
        binding.bnvMain.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_news -> {
                    changeFragment(topNewsFragment)
                }
                R.id.menu_category -> {
                    changeFragment(categoryFragment)
                }
                R.id.menu_save -> {
                    changeFragment(savedNewsFragment)
                }
            }
            return@setOnItemSelectedListener true
        }
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fcv_main, fragment).commit()
    }
}