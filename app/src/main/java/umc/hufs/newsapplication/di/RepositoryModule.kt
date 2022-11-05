package umc.hufs.newsapplication.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import umc.hufs.newsapplication.data.repository.LocalDummyNewsRepositoryImpl
import umc.hufs.newsapplication.domain.repository.LocalDummyNewsRepository
import javax.inject.Singleton

/**
 * NewsApplication
 * @author jaesung
 * @created 2022/11/06
 * @desc
 */

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindLocalDummyNewsRepository(
        localDummyNewsRepositoryImpl: LocalDummyNewsRepositoryImpl
    ): LocalDummyNewsRepository
}