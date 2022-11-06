package umc.hufs.newsapplication.presentation.category

import android.os.Bundle
import android.view.View
import dagger.hilt.android.AndroidEntryPoint
import umc.hufs.newsapplication.R
import umc.hufs.newsapplication.databinding.FragmentCategoryNewsBinding
import umc.hufs.newsapplication.presentation.common.base.BaseFragment

@AndroidEntryPoint
class CategoryNewsFragment : BaseFragment<FragmentCategoryNewsBinding>(R.layout.fragment_category_news) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}