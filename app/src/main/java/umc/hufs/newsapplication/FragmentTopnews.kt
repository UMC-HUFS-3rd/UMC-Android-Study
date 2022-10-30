package umc.hufs.newsapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import umc.hufs.newsapplication.databinding.FragmentTopnewsEditBinding

class FragmentTopnews: Fragment() {
    private lateinit var viewBinding: FragmentTopnewsEditBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentTopnewsEditBinding.inflate(layoutInflater)
        return viewBinding.root

        val dataList: ArrayList<TopnewsData> = arrayListOf()

        dataList.apply {
            add(TopnewsData("Photo proves US star is a cheat code as world record obliterated - Fox Sports", "Pedro", "1 hours ago"))
            add(TopnewsData("Nasa set to announce plans to return samples from Mars back to Earth", "Anna", "11 hours ago"))
        }

        val topnewsRVAdapter = TopnewsRVAdapter(dataList)

        viewBinding.rvTopnews.adapter = topnewsRVAdapter
        viewBinding.rvTopnews.layoutManager = LinearLayoutManager(requireContext())

    }
}