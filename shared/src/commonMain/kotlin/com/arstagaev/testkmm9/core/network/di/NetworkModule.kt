package com.arstagaev.testkmm9.core.network.di

import com.arstagaev.testkmm9.core.network.client.TKClient
import com.arstagaev.testkmm9.core.network.createHttpClient
import org.koin.core.module.Module
import org.koin.dsl.module

val networkModule: (enableLogging: Boolean) -> Module get() = { enableLogging ->
    module {
        single { createHttpClient(enableLogging) }
        single { TKClient(httpClient = get()) }
    }
}