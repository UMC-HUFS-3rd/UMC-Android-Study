package umc.hufs.newsapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import umc.hufs.newsapplication.databinding.ItemNewsBinding

class TopnewsRVAdapter(private val dataList: ArrayList<TopnewsData>): RecyclerView.Adapter<TopnewsRVAdapter.TopnewsDataViewHolder>() {

    inner class TopnewsDataViewHolder(private val viewBinding: ItemNewsBinding): RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(data: TopnewsData) {
            viewBinding.tvHeadline.text = data.title.toString()
            viewBinding.ivNewsPic.setImageResource(data.pic)
            viewBinding.tvTime.text = data.time.toString()
            viewBinding.tvJournalist.text = data.name.toString()
        }
    }

    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopnewsDataViewHolder {
        val viewBinding = ItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TopnewsDataViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: TopnewsDataViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size
}


