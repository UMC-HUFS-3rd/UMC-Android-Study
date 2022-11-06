package umc.hufs.newsapplication.data.source.entity

import kotlinx.serialization.SerialName

/**
 * NewsApplication
 * @author jaesung
 * @created 2022/11/05
 * @desc
 */
@kotlinx.serialization.Serializable
data class News(
    val source: Source,
    val author: String?,
    val title: String,
    val description: String?,
    @SerialName("url") val newsOriginUrl: String,
    @SerialName("urlToImage") val thumbnailImageUrl: String?,
    @SerialName("publishedAt") val publishedDate: String,
    val content: String?
)

@kotlinx.serialization.Serializable
data class Source(
    val id: String?,
    val name: String
)