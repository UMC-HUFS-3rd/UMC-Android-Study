package umc.hufs.newsapplication.data.repository

import umc.hufs.newsapplication.data.source.local.DummyNewsDataSourceImpl
import umc.hufs.newsapplication.domain.mapper.mapToArticle
import umc.hufs.newsapplication.domain.model.Article
import umc.hufs.newsapplication.domain.repository.LocalDummyNewsRepository
import javax.inject.Inject

/**
 * NewsApplication
 * @author jaesung
 * @created 2022/11/06
 * @desc
 */
class LocalDummyNewsRepositoryImpl @Inject constructor(
    private val dummyDataSource: DummyNewsDataSourceImpl
) : LocalDummyNewsRepository {
    override fun getDummyNewsList(): List<Article> {
        return dummyDataSource.getDummyNewsList().mapToArticle()
    }
}