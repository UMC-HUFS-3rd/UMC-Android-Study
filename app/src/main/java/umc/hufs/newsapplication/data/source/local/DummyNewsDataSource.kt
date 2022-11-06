package umc.hufs.newsapplication.data.source.local

import umc.hufs.newsapplication.data.source.entity.News

/**
 * NewsApplication
 * @author jaesung
 * @created 2022/11/06
 * @desc
 */
interface DummyNewsDataSource {

    fun getDummyNewsList() : List<News>
}