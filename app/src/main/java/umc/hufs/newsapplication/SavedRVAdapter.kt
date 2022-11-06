package umc.hufs.newsapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import umc.hufs.newsapplication.databinding.ItemSavedBinding

class SavedRVAdapter(private val dataList: ArrayList<SavedData>): RecyclerView.Adapter<SavedRVAdapter.SavedViewHolder>() {
    inner class SavedViewHolder(private val viewBinding: ItemSavedBinding): RecyclerView.ViewHolder(viewBinding.root){
        fun bind(data: SavedData) {
            viewBinding.tvSavedHeadline.text = data.title.toString()
            viewBinding.ivSavedNewsPic.setImageResource(data.pic)
            viewBinding.tvSavedTime.text = data.time.toString()
            viewBinding.tvSavedJournalist.text = data.name.toString()
        }
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SavedViewHolder {
        val viewBinding = ItemSavedBinding.inflate(LayoutInflater.from(parent.context))
        return SavedViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: SavedViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount(): Int = dataList.size


}