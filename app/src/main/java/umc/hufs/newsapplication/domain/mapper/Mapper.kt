package umc.hufs.newsapplication.domain.mapper

import umc.hufs.newsapplication.data.source.entity.News
import umc.hufs.newsapplication.domain.model.Article

/**
 * NewsApplication
 * @author jaesung
 * @created 2022/11/06
 * @desc
 */

fun List<News>.mapToArticle(): List<Article> {
    val articleList = mutableListOf<Article>()

    this.map { news ->
        articleList.add(
            Article(
                sourceName = news.source.name,
                author = news.author ?: "",
                title = news.title,
                description = news.description ?: "",
                newsOriginUrl = news.newsOriginUrl,
                thumbnailImageUrl = news.thumbnailImageUrl ?: "" ,
                publishedDate = news.publishedDate,  // TODO DateTime Formatting
                content = news.content ?: "",
            )
        )
    }

    return articleList
}