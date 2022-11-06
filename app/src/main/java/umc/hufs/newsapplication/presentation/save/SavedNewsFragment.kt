package umc.hufs.newsapplication.presentation.save

import android.os.Bundle
import android.view.View
import dagger.hilt.android.AndroidEntryPoint
import umc.hufs.newsapplication.R
import umc.hufs.newsapplication.databinding.FragmentSavedNewsBinding
import umc.hufs.newsapplication.presentation.common.base.BaseFragment

@AndroidEntryPoint
class SavedNewsFragment : BaseFragment<FragmentSavedNewsBinding>(R.layout.fragment_saved_news) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}