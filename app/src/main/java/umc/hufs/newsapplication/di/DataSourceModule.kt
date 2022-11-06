package umc.hufs.newsapplication.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import umc.hufs.newsapplication.data.source.local.DummyNewsDataSource
import umc.hufs.newsapplication.data.source.local.DummyNewsDataSourceImpl
import javax.inject.Singleton

/**
 * NewsApplication
 * @author jaesung
 * @created 2022/11/06
 * @desc
 */

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    @Singleton
    abstract fun bindsDummyNewsDataSource(
        dummyNewsDataSourceImpl: DummyNewsDataSourceImpl
    ): DummyNewsDataSource
}