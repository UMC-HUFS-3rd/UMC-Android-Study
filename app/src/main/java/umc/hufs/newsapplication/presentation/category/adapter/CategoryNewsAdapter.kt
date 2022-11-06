package umc.hufs.newsapplication.presentation.category.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import umc.hufs.newsapplication.databinding.ItemNewsBinding
import umc.hufs.newsapplication.domain.model.Article

/**
 * NewsApplication
 * @author jaesung
 * @created 2022/11/06
 * @desc
 */
class CategoryNewsAdapter : ListAdapter<Article, CategoryNewsAdapter.CategoryNewsViewHolder>(DIFF_CALLBACK) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryNewsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemNewsBinding.inflate(inflater, parent, false)
        return CategoryNewsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryNewsViewHolder, position: Int) {
        val item = getItem(position)
        item?.let {
            holder.bindItems(it)
        }
    }

    class CategoryNewsViewHolder(
        private val binding: ItemNewsBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bindItems(item: Article) {
            with(binding) {
                tvAuthor.text = item.author
                tvNewsTime.text = item.publishedDate
                tvContent.text = item.content
            }

//            with(binding) {
//                article = item
//                executePendingBindings()
//            }
        }
    }

    companion object {
        val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Article>() {
            override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem.title == newItem.title
            }

            override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
                return oldItem == newItem
            }
        }
    }
}