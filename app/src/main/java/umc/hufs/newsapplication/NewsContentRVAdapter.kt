package umc.hufs.newsapplication

import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import umc.hufs.newsapplication.databinding.ItemNewsContentBinding

class NewsContentRVAdapter(private val dataList: ArrayList<NewsContentData>): RecyclerView.Adapter<NewsContentRVAdapter.NewsContentDataViewHolder>() {

    inner class NewsContentDataViewHolder(private val viewBinding: ItemNewsContentBinding): RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(data: NewsContentData) {
            viewBinding.tvArticleTitle.text = data.title
            viewBinding.tvArticleContent.text = data.content
            viewBinding.tvTimeUploaded.text = data.time
            viewBinding.tvJournalistName.text = data.name
        }
    }
}