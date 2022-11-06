package umc.hufs.newsapplication

import android.graphics.drawable.Drawable
import android.media.Image
import android.widget.ImageView

data class NewsContentData(
    val title: String,
    val pic: Int,
    val name: String,
    val time: String,
    val content: String,
)
