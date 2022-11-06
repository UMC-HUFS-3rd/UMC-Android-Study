package umc.hufs.newsapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import umc.hufs.newsapplication.databinding.FragmentNewsContentBinding

class FragmentNewsContent: Fragment() {
    private lateinit var viewBinding: FragmentNewsContentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentNewsContentBinding.inflate(layoutInflater)
        return viewBinding.root

        val dataList: ArrayList<NewsContentData> = arrayListOf()

        dataList.apply {
            add(NewsContentData("${R.id.firstArticleTitle}", R.drawable.first_article_pic,"${R.id.firstArticleJournalist}" ,"${R.id.firstArticleUpload}" ,"${R.id.firstArticlePhoto}"))
        }

        val newsContentRVAdapter = NewsContentRVAdapter(dataList)

        viewBinding.rvNewsDetail.adapter = newsContentRVAdapter
        viewBinding.rvNewsDetail.layoutManager = LinearLayoutManager(requireContext())

    }
}