package umc.hufs.newsapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import umc.hufs.newsapplication.databinding.ActivityMainBinding
import java.lang.reflect.Array.newInstance
import javax.xml.transform.TransformerFactory.newInstance

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        supportFragmentManager
            .beginTransaction()
            .replace(viewBinding.frameLayout.id,ListFragment())
            .commit()
        viewBinding.bottomNavigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
    private val onNavigationItemSelectedListener = BottomNavigationView
        .OnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.menu_topnews -> {
                    supportFragmentManager.beginTransaction()
                        .replace(viewBinding.frameLayout.id, ListFragment())
                        .commit()
                }
                R.id.menu_categories -> {

                    supportFragmentManager.beginTransaction()
                        .replace(viewBinding.frameLayout.id, CategoryFragment())
                        .commit()
                }
                R.id.menu_saved -> {
                    supportFragmentManager.beginTransaction()
                        .replace(viewBinding.frameLayout.id, ListFragment())
                        .commit()
                }
            }
            true
        }
}