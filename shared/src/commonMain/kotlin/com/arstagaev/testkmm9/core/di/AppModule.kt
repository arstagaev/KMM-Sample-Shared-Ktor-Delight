package com.arstagaev.testkmm9.core.di

import com.arstagaev.testkmm9.core.network.di.networkModule
import com.arstagaev.testkmm9.data.repository.TKRepositoryImpl
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(enableNetworkLogs: Boolean = false, appDeclaration: KoinAppDeclaration = {}) =
    startKoin {
        appDeclaration()
        modules(
            module {
                single {
                    TKRepositoryImpl()
                }
                //single<TKRepository> {  }
                //single<TKRepository> { TKRepositoryImpl() }
//                single { createHttpClient(enableLogging) }
//                single { TKClient(httpClient = get()) }
            },
            //databaseModule,
            networkModule(enableNetworkLogs),
        )
    }