package umc.hufs.newsapplication.data.source.local

import umc.hufs.newsapplication.data.source.entity.News
import umc.hufs.newsapplication.data.source.entity.Source
import javax.inject.Inject

/**
 * NewsApplication
 * @author jaesung
 * @created 2022/11/05
 * @desc
 */
class DummyNewsDataSourceImpl @Inject constructor() : DummyNewsDataSource {

    private val newsList = mutableListOf<News>()

    override fun getDummyNewsList(): List<News> {
        newsList.apply {
            add(
                News(
                    source = Source(
                        id = "a",
                        name = "Reuters"
                    ),
                    author = null,
                    title = "Title A",
                    description = "Berkshire Hathaway Inc <a href=\"https://www.reuters.com/companies/BRKa.N\" target=\"_blank\">(BRKa.N)</a> on Saturday posted a third-quarter loss, as the conglomerate run by billionaire Warren Buffett said it lost money on its stock investments and from insuranc…",
                    newsOriginUrl = "https://www.reuters.com/business/berkshire-hathaway-posts-quarterly-loss-stock-holdings-fall-2022-11-05/",
                    thumbnailImageUrl = "https://www.reuters.com/resizer/Hr9Dsh947F-I-WckRYHml5GadyI=/1200x628/smart/filters:quality(80)/cloudfront-us-east-2.images.arcpublishing.com/reuters/KZGPAVRWK5I45PRZP6SW3LSOCQ.jpg",
                    publishedDate = "2022-11-05T12:21:00Z",
                    content = "Nov 5 (Reuters) - Berkshire Hathaway Inc (BRKa.N) on Saturday posted a third-quarter loss, as the conglomerate run by billionaire Warren Buffett said it lost money on its stock investments and from i… [+617 chars]"
                ),
            )
            add(
                News(
                    source = Source(
                        id = null,
                        name = "Reuters"
                    ),
                    author = null,
                    title = "Title B",
                    description = "Berkshire Hathaway Inc <a href=\"https://www.reuters.com/companies/BRKa.N\" target=\"_blank\">(BRKa.N)</a> on Saturday posted a third-quarter loss, as the conglomerate run by billionaire Warren Buffett said it lost money on its stock investments and from insuranc…",
                    newsOriginUrl = "https://www.spiegel.de/wirtschaft/service/dispozinsen-runter-mit-dem-dispo-raus-aus-dem-dispo-ein-leitfaden-a-25538042-19c2-41e1-a796-27d64045a7c6",
                    thumbnailImageUrl = "https://cdn.prod.www.spiegel.de/images/37baacc1-7213-4446-a46b-148b0b37aa2b_w1280_r1.77_fpx67.15_fpy50.jpg",
                    publishedDate = "2022-11-05T12:21:00Z",
                    content = "Nov 5 (Reuters) - Berkshire Hathaway Inc (BRKa.N) on Saturday posted a third-quarter loss, as the conglomerate run by billionaire Warren Buffett said it lost money on its stock investments and from i… [+617 chars]"
                )
            )
            add(
                News(
                    source = Source(
                        id = "c",
                        name = "Reuters"
                    ),
                    author = null,
                    title = "Title C",
                    description = "Berkshire Hathaway Inc <a href=\"https://www.reuters.com/companies/BRKa.N\" target=\"_blank\">(BRKa.N)</a> on Saturday posted a third-quarter loss, as the conglomerate run by billionaire Warren Buffett said it lost money on its stock investments and from insuranc…",
                    newsOriginUrl = "https://www.golem.de/sonstiges/zustimmung/auswahl.html?from=https:%2F%2Fwww.golem.de%2Fnews%2Fsoziales-netzwerk-elon-musk-droht-werbekunden-von-twitter-2211-169500.html",
                    thumbnailImageUrl = null,
                    publishedDate = "2022-11-05T12:21:00Z",
                    content = "Nov 5 (Reuters) - Berkshire Hathaway Inc (BRKa.N) on Saturday posted a third-quarter loss, as the conglomerate run by billionaire Warren Buffett said it lost money on its stock investments and from i… [+617 chars]"
                )
            )
            add(
                News(
                    source = Source(
                        id = "d",
                        name = "Reuters"
                    ),
                    author = null,
                    title = "Title D",
                    description = "Berkshire Hathaway Inc <a href=\"https://www.reuters.com/companies/BRKa.N\" target=\"_blank\">(BRKa.N)</a> on Saturday posted a third-quarter loss, as the conglomerate run by billionaire Warren Buffett said it lost money on its stock investments and from insuranc…",
                    newsOriginUrl = "https://www.tz.de/welt/euro-details-geld-kaufland-pfandbon-worms-rheinland-pfalz-supermarkt-91888013.html",
                    thumbnailImageUrl = "https://www.tz.de/bilder/2022/11/01/91888013/30189578-kaufland-pfandbon-2nlOWAaMNOfe.jpg",
                    publishedDate = "2022-11-05T12:21:00Z",
                    content = "Nov 5 (Reuters) - Berkshire Hathaway Inc (BRKa.N) on Saturday posted a third-quarter loss, as the conglomerate run by billionaire Warren Buffett said it lost money on its stock investments and from i… [+617 chars]"
                )
            )
            add(
                News(
                    source = Source(
                        id = "e",
                        name = "Reuters"
                    ),
                    author = null,
                    title = "Title E",
                    description = "Berkshire Hathaway Inc <a href=\"https://www.reuters.com/companies/BRKa.N\" target=\"_blank\">(BRKa.N)</a> on Saturday posted a third-quarter loss, as the conglomerate run by billionaire Warren Buffett said it lost money on its stock investments and from insuranc…",
                    newsOriginUrl = "https://www.youtube.com/watch?v=lhHBhQHQDag",
                    thumbnailImageUrl = "https://i.ytimg.com/vi/lhHBhQHQDag/hqdefault.jpg",
                    publishedDate = "2022-11-05T12:21:00Z",
                    content = "Nov 5 (Reuters) - Berkshire Hathaway Inc (BRKa.N) on Saturday posted a third-quarter loss, as the conglomerate run by billionaire Warren Buffett said it lost money on its stock investments and from i… [+617 chars]"
                )
            )
        }

        return newsList.toList()
    }
}