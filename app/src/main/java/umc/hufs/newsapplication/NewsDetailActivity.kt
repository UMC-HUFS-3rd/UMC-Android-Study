package umc.hufs.newsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import umc.hufs.newsapplication.databinding.ActivityMainBinding
import umc.hufs.newsapplication.databinding.ActivityNewsDetailBinding

class NewsDetailActivity : AppCompatActivity() {
    private  lateinit var viewBinding: ActivityNewsDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)
    }
}