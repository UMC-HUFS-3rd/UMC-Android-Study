package umc.hufs.newsapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL
import androidx.recyclerview.widget.RecyclerView
import umc.hufs.newsapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)

        viewBinding.rvNewsList.setOnClickListener {
            val intent = Intent(this, NewsDetailActivity::class.java)
            startActivity(intent)

        }
        setContentView(R.layout.activity_main)
        // 1
        viewManager = LinearLayoutManager(this, HORIZONTAL, true)
    }
}
        // 2
//        viewAdapter = MyAdapter()
//
//        // 3
//        recyclerView = findViewById<RecyclerView>(R.id.recyclerview_main).apply {
//            // use this setting to improve performance if you know that changes
//            // in content do not change the layout size of the RecyclerView
//            setHasFixedSize(true)
//            // use a linear layout manager
//            layoutManager = viewManager
//            // specify an viewAdapter (see also next example)
//            adapter = viewAdapter
//
//        }
//    }
//}