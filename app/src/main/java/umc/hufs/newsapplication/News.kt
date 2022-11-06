package umc.hufs.newsapplication

import java.util.*

data class News(
    val title:String,
    val content:String,
    val publishor: String,
    val publishDate: Date
)
