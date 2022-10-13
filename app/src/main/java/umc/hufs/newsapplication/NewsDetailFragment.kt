package umc.hufs.newsapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import umc.hufs.newsapplication.databinding.FragmentNewsDetailBinding


class NewsDetailFragment: Fragment() {
    private lateinit var viewBinding: FragmentNewsDetailBinding

    // layout과 연결하는 함수
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentNewsDetailBinding.inflate(layoutInflater)
        return viewBinding.root //setContentView 대신 리턴해줌
    }
}