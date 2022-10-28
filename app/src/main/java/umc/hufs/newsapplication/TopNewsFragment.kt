package umc.hufs.newsapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import umc.hufs.newsapplication.databinding.FragmentTopNewsBinding

class TopNewsFragment : Fragment() {
    private lateinit var viewBinding: FragmentTopNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewBinding = FragmentTopNewsBinding.inflate(layoutInflater)
        return viewBinding.root
    }
}