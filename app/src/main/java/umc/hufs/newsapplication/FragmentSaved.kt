package umc.hufs.newsapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import umc.hufs.newsapplication.databinding.FragmentSavedBinding

class FragmentSaved: Fragment() {
    private lateinit var viewBinding: FragmentSavedBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentSavedBinding.inflate(layoutInflater)
        return viewBinding.root
    }
}