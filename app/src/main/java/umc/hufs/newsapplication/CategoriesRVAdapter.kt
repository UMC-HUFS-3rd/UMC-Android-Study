package umc.hufs.newsapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import umc.hufs.newsapplication.databinding.ItemCategoriesBinding
import umc.hufs.newsapplication.databinding.ItemNewsContentBinding

class CategoriesRVAdapter(private val dataList: ArrayList<CategoriesData>): RecyclerView.Adapter<CategoriesRVAdapter.CategoriesDataViewHolder>() {
    inner class CategoriesDataViewHolder(private val viewBinding: ItemCategoriesBinding): RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(data: CategoriesData) {
            viewBinding.ivCategories.setImageResource(data.pic)
            viewBinding.tvCategories.text = data.cat
        }
    }
    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesRVAdapter.CategoriesDataViewHolder {
        val viewBinding = ItemCategoriesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoriesDataViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: CategoriesDataViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size

}