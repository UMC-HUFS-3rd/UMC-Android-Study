package umc.hufs.newsapplication.presentation.category

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import dagger.hilt.android.AndroidEntryPoint
import umc.hufs.newsapplication.R
import umc.hufs.newsapplication.databinding.FragmentCategoryNewsBinding
import umc.hufs.newsapplication.presentation.MainViewModel
import umc.hufs.newsapplication.presentation.category.adapter.CategoryNewsAdapter
import umc.hufs.newsapplication.presentation.common.base.BaseFragment

@AndroidEntryPoint
class CategoryNewsFragment : BaseFragment<FragmentCategoryNewsBinding>(R.layout.fragment_category_news) {

    private val viewModel: MainViewModel by activityViewModels()
    private val categoryNewsAdapter by lazy { CategoryNewsAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    private fun initView() {
        val newsList = viewModel.getDummyNews()

        binding.rvCategoryNews.adapter = categoryNewsAdapter.also {
            it.submitList(newsList)
        }

    }
}