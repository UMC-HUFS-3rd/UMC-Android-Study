package umc.hufs.newsapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import umc.hufs.newsapplication.databinding.FragmentCategoryBinding


class CategoryFragment : Fragment() {


    private lateinit var viewBindng : FragmentCategoryBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBindng = FragmentCategoryBinding.inflate(layoutInflater)
        return viewBindng.root
    }

}