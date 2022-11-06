package umc.hufs.newsapplication.presentation

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import umc.hufs.newsapplication.domain.model.Article
import umc.hufs.newsapplication.domain.usecase.GetDummyNewsUseCase
import javax.inject.Inject

/**
 * NewsApplication
 * @author jaesung
 * @created 2022/11/06
 * @desc
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    private val getDummyNewsUseCase: GetDummyNewsUseCase
) : ViewModel() {

    fun getDummyNews(): List<Article> {
        val list = getDummyNewsUseCase.invoke()
        Timber.e("$list")
        return list
    }

}