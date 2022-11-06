package umc.hufs.newsapplication.domain.model

/**
 * NewsApplication
 * @author jaesung
 * @created 2022/11/06
 * @desc
 */
data class Article(
    val sourceName: String,
    val author: String,
    val title: String,
    val description: String,
    val newsOriginUrl: String,
    val thumbnailImageUrl: String,
    val publishedDate: String,
    val content: String,
    val isSaved: Boolean = false
) {
    companion object {
        val dummyArticle = Article(
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            false
        )
    }
}
