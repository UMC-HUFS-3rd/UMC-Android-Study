package umc.hufs.newsapplication.presentation.news

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import umc.hufs.newsapplication.databinding.ItemNewsBinding
import umc.hufs.newsapplication.domain.model.Article

/**
 * NewsApplication
 * @author jaesung
 * @created 2022/11/06
 * @desc
 */
class TopNewsAdapter(
    private val context: Context,
    private val newsList: List<Article>
) : RecyclerView.Adapter<TopNewsAdapter.TopNewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopNewsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemNewsBinding.inflate(inflater, parent, false)
        return TopNewsViewHolder(binding, context)
    }

    override fun onBindViewHolder(holder: TopNewsViewHolder, position: Int) {
        holder.bindItems(newsList[position])
    }

    override fun getItemCount() = newsList.size

    class TopNewsViewHolder(
        private val binding: ItemNewsBinding,
        val context: Context
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bindItems(article: Article) {
            with(binding) {
                tvAuthor.text = article.author
                tvNewsTime.text = article.publishedDate
                tvContent.text = article.content
            }

            Glide.with(context)
                .load(article.thumbnailImageUrl)
                .error(Glide.with(context).load("https://usagi-post.com/wp-content/uploads/2020/05/no-image-found-360x250-1-300x208.png"))
                .into(binding.ivNews)
        }
    }
}