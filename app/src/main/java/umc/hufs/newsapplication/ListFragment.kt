package umc.hufs.newsapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import umc.hufs.newsapplication.databinding.FragmentListBinding

class ListFragment : Fragment() {

    private lateinit var viewBindng : FragmentListBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBindng = FragmentListBinding.inflate(layoutInflater)
        return viewBindng.root
    }
}