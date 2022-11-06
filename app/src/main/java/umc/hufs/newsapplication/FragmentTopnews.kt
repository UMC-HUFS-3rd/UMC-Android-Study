package umc.hufs.newsapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import umc.hufs.newsapplication.databinding.FragmentTopnewsBinding

class FragmentTopnews: Fragment() {
    private lateinit var viewBinding: FragmentTopnewsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentTopnewsBinding.inflate(layoutInflater)
        return viewBinding.root

        val dataList: ArrayList<TopnewsData> = arrayListOf()

        dataList.apply {
            add(TopnewsData("Photo proves US star is a cheat code as world record obliterated - Fox Sports", R.drawable.basketball_article_photo, "Pedro", "1 hours ago"))
            add(TopnewsData("Nasa set to announce plans to return samples from Mars back to Earth", R.drawable.bicycle_article_photo,"Anna", "11 hours ago"))
        }

        val topnewsRVAdapter = TopnewsRVAdapter(dataList)

        viewBinding.rvTopNews.adapter = topnewsRVAdapter
        viewBinding.rvTopNews.layoutManager = LinearLayoutManager(requireContext())


    }
}