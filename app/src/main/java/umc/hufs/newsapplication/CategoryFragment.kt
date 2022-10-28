package umc.hufs.newsapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import umc.hufs.newsapplication.databinding.FragmentCategoryBinding

class CategoryFragment : Fragment() {
    private lateinit var viewBinding: FragmentCategoryBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentCategoryBinding.inflate(layoutInflater)
        return viewBinding.root
    }
}