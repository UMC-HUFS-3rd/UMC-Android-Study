package umc.hufs.newsapplication.domain.repository

import umc.hufs.newsapplication.domain.model.Article

/**
 * NewsApplication
 * @author jaesung
 * @created 2022/11/06
 * @desc
 */
interface LocalDummyNewsRepository {

    fun getDummyNewsList(): List<Article>
}