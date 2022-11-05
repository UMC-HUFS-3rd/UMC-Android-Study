package umc.hufs.newsapplication.presentation.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import umc.hufs.newsapplication.R
import umc.hufs.newsapplication.databinding.FragmentNewsDetailBinding
import umc.hufs.newsapplication.presentation.common.base.BaseFragment

@AndroidEntryPoint
class NewsDetailFragment : BaseFragment<FragmentNewsDetailBinding>(R.layout.fragment_news_detail) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}