package umc.hufs.newsapplication.presentation.category

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import umc.hufs.newsapplication.R
import umc.hufs.newsapplication.databinding.FragmentCategoryBinding
import umc.hufs.newsapplication.presentation.common.base.BaseFragment

@AndroidEntryPoint
class CategoryFragment : BaseFragment<FragmentCategoryBinding>(R.layout.fragment_category) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvCategoryTitle.setOnClickListener {
            findNavController().navigate(R.id.action_category_to_category_news)
        }
    }
}