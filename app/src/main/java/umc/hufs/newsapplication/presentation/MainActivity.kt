package umc.hufs.newsapplication.presentation

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import umc.hufs.newsapplication.R
import umc.hufs.newsapplication.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initLifecycleOwner()

        initNavigation()
        setNavigationListener()
    }

    private fun initLifecycleOwner() {
        binding.lifecycleOwner = this
    }

    private fun initNavigation() {
        binding.bnvMain.setupWithNavController(findNavController())
    }

    private fun findNavController(): NavController {
        val navHostFragment =
            supportFragmentManager.findFragmentById(binding.fcvMain.id) as NavHostFragment
        return navHostFragment.navController
    }

    private fun setNavigationListener() {
        findNavController().addOnDestinationChangedListener { _, destination, _ ->
            binding.bnvMain.visibility = when (destination.id) {
                R.id.navigation_top_news, R.id.navigation_category, R.id.navigation_save -> View.VISIBLE
                else -> View.GONE
            }
        }
    }
}