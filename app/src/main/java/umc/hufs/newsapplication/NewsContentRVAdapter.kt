package umc.hufs.newsapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import umc.hufs.newsapplication.databinding.ItemNewsBinding
import umc.hufs.newsapplication.databinding.ItemNewsContentBinding

class NewsContentRVAdapter(private val dataList: ArrayList<NewsContentData>): RecyclerView.Adapter<NewsContentRVAdapter.NewsContentDataViewHolder>() {

    inner class NewsContentDataViewHolder(private val viewBinding: ItemNewsContentBinding): RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(data: NewsContentData) {
            viewBinding.tvArticleTitle.text = data.title
            viewBinding.tvArticleContent.text = data.content
            viewBinding.ivArticlePhoto.setImageResource(data.pic)
            viewBinding.tvTimeUploaded.text = data.time
            viewBinding.tvJournalistName.text = data.name
        }
    }
    override fun getItemViewType(position: Int): Int {
        return super.getItemViewType(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsContentDataViewHolder {
        val viewBinding = ItemNewsContentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return NewsContentDataViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: NewsContentDataViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size
}