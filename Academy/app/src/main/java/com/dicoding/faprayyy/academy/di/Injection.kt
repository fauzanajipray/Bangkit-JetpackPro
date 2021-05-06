package com.dicoding.faprayyy.academy.di

import android.content.Context
import com.dicoding.faprayyy.academy.data.source.AcademyRepository
import com.dicoding.faprayyy.academy.data.source.remote.RemoteDataSource
import com.dicoding.faprayyy.academy.utils.JsonHelper

object Injection {
    fun provideRepository(context: Context): AcademyRepository {

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))

        return AcademyRepository.getInstance(remoteDataSource)
    }
}