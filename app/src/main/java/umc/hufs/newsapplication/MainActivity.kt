package umc.hufs.newsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import umc.hufs.newsapplication.databinding.ActivityMainBinding
import androidx.fragment.app.FragmentManager
import androidx.viewbinding.ViewBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        setContentView(viewBinding.root)
        setFragment(TopNewsFragment.toString(), TopNewsFragment)
        initBottomNavigation()
    }
    private fun initBottomNavigation(){
        supportFragmentManager
            .beginTransaction()
            .replace(viewBinding.bottomNavi.id, TopNewsFragment())
            .commitAllowingStateLoss()
        viewBinding.bottomNavi.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.topnews -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.bottomNavi, TopNewsFragment())
                        .commitAllowingStateLoss()
                }

                R.id.categories -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.bottomNavi, CategoryFragment())
                        .commitAllowingStateLoss()
                }
            }
            else{
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.bottomNavi, SavedFragment())
                        .commitAllowingStateLoss()
            }
        }
    }
    private fun setFragment(tag:String, fragment: TopNewsFragment.Companion){
        val manager : FragmentManager = supportFragmentManager
        val fragTransaction = manager.beginTransaction()

        if(manager.findFragmentByTag(tag) == null){
            fragTransaction.add(, fragment,tag)
        }
        val topnews = manager.findFragmentByTag(TopNewsFragment.toString())
        val category = manager.findFragmentByTag(CategoryFragment.toString())
        val saved = manager.findFragmentByTag(SavedFragment.toString())
        if(topnews !=null){
            fragTransaction.hide(topnews)
        }
        if(category != null){
            fragTransaction.hide(category)
        }
        if(saved != null){
            fragTransaction.hide(saved)
        }
        if(tag == TopNewsFragment.toString()){
            if (topnews!=null){
                fragTransaction.show(topnews)
            }
        }
        else if(tag == CategoryFragment.toString()){
            if (category!=null){
                fragTransaction.show(category)
            }
        }
        else if(tag == SavedFragment.toString()){
            if (saved!=null){
                fragTransaction.show(saved)
            }
        }

        fragTransaction.commitAllowingStateLoss()

    }
}