package com.dicoding.faprayyy.academy.data.source.remote

import android.util.Log
import com.dicoding.faprayyy.academy.data.source.remote.response.ContentResponse
import com.dicoding.faprayyy.academy.data.source.remote.response.CourseResponse
import com.dicoding.faprayyy.academy.data.source.remote.response.ModuleResponse
import com.dicoding.faprayyy.academy.utils.JsonHelper

class RemoteDataSource private constructor(private val jsonHelper: JsonHelper) {

    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(helper: JsonHelper): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource(helper).apply { instance = this }
            }
    }

    fun getAllCourses(): List<CourseResponse> {
        val data  = jsonHelper.loadCourses()
        Log.d("getAllCourses 1", "$data")
        return data
    }

    fun getModules(courseId: String): List<ModuleResponse> = jsonHelper.loadModule(courseId)

    fun getContent(moduleId: String):  ContentResponse = jsonHelper.loadContent(moduleId)

}