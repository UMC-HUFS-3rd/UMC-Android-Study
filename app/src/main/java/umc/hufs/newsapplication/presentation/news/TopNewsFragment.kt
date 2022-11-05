package umc.hufs.newsapplication.presentation.news

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import dagger.hilt.android.AndroidEntryPoint
import umc.hufs.newsapplication.R
import umc.hufs.newsapplication.databinding.FragmentTopNewsBinding
import umc.hufs.newsapplication.presentation.MainViewModel
import umc.hufs.newsapplication.presentation.common.base.BaseFragment

@AndroidEntryPoint
class TopNewsFragment : BaseFragment<FragmentTopNewsBinding>(R.layout.fragment_top_news) {

    private val viewModel: MainViewModel by activityViewModels()
    private lateinit var topNewsAdapter: TopNewsAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()

    }

    private fun initView() {
        val newsList = viewModel.getDummyNews()
        topNewsAdapter = TopNewsAdapter(requireContext(), newsList)

        binding.rvTopNews.adapter = topNewsAdapter
    }
}