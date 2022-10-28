package umc.hufs.newsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import umc.hufs.newsapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(viewBinding.framelayout.id, TopNewsFragment())
            .commit()
        viewBinding.bottomNavigation.setOnNavigationItemSelectedListener(
            onNavigationItemSelectedListener
        )
    }

    private val onNavigationItemSelectedListener = BottomNavigationView
        .OnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.top_news -> {
                    supportFragmentManager.beginTransaction()
                        .replace(viewBinding.framelayout.id, TopNewsFragment())
                        .commit()
                }
                R.id.category -> {
                    supportFragmentManager.beginTransaction()
                        .replace(viewBinding.framelayout.id, CategoryFragment())
                        .commit()
                }
                R.id.saved -> {
                    supportFragmentManager.beginTransaction()
                        .replace(viewBinding.framelayout.id, SavedNewsFragment())
                        .commit()
                }
            }
            true
        }
}



