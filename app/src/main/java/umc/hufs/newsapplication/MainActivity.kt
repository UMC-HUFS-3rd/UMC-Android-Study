package umc.hufs.newsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import umc.hufs.newsapplication.databinding.CategoriesBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:CategoriesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CategoriesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}