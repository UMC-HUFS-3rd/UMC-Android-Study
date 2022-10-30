package umc.hufs.newsapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import umc.hufs.newsapplication.databinding.FragmentDetailBinding
import umc.hufs.newsapplication.databinding.FragmentListBinding


class DetailFragment : Fragment() {

    private lateinit var viewBindng : FragmentDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View? {
        viewBindng = FragmentDetailBinding.inflate(layoutInflater)
        return viewBindng.root
    }
}