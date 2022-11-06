package umc.hufs.newsapplication.presentation.common

import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.google.android.material.imageview.ShapeableImageView

/**
 * NewsApplication
 * @author jaesung
 * @created 2022/11/06
 * @desc
 */

@BindingAdapter("loadThumbnail")
fun bindThumbnailImageUrl(view: ShapeableImageView, thumbnailImageUrl: String?) {
    if (!thumbnailImageUrl.isNullOrEmpty()) {
        Glide.with(view.context)
            .load(thumbnailImageUrl)
            .error(
                Glide.with(view.context)
                    .load("https://usagi-post.com/wp-content/uploads/2020/05/no-image-found-360x250-1-300x208.png")
            )
            .into(view)
    }
}