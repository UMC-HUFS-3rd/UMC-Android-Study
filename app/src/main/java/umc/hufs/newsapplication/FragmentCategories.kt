package umc.hufs.newsapplication

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import umc.hufs.newsapplication.databinding.FragmentCategoriesBinding

class FragmentCategories: Fragment() {
    private lateinit var viewBinding: FragmentCategoriesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentCategoriesBinding.inflate(layoutInflater)
        return viewBinding.root

        val dataList: ArrayList<CategoriesData> = arrayListOf()
        
        dataList.apply {
            add(CategoriesData(R.drawable.ic_business, "business"))
            add(CategoriesData(R.drawable.ic_outline_music_note_24, "entertainment"))
        }

        val categoriesRVAdapter = CategoriesRVAdapter(dataList)

        viewBinding.rvCategories.adapter = categoriesRVAdapter
        viewBinding.rvCategories.layoutManager = GridLayoutManager(requireContext(), 3)
    }
}