package umc.hufs.newsapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import umc.hufs.newsapplication.databinding.ActivityCategoriesBinding.inflate
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
    }

}