package com.arstagaev.testkmm9.data.di

import com.arstagaev.testkmm9.data.repository.TKRepository
import com.arstagaev.testkmm9.data.repository.TKRepositoryImpl
import org.koin.dsl.module

val dataModule = module {
    single<TKRepository> { TKRepositoryImpl() }
}