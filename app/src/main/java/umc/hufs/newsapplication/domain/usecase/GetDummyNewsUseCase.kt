package umc.hufs.newsapplication.domain.usecase

import umc.hufs.newsapplication.domain.model.Article
import umc.hufs.newsapplication.domain.repository.LocalDummyNewsRepository
import javax.inject.Inject

/**
 * NewsApplication
 * @author jaesung
 * @created 2022/11/06
 * @desc
 */
class GetDummyNewsUseCase @Inject constructor(
    private val localDummyNewsRepository: LocalDummyNewsRepository
) {
    fun invoke(): List<Article> {
        return localDummyNewsRepository.getDummyNewsList()
    }
}