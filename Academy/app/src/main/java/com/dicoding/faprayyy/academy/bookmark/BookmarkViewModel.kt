package com.dicoding.faprayyy.academy.bookmark

import androidx.lifecycle.ViewModel
import com.dicoding.faprayyy.academy.data.CourseEntity
import com.dicoding.faprayyy.academy.utils.DataDummy

class BookmarkViewModel : ViewModel() {

    fun getBookmark(): List<CourseEntity> = DataDummy.DataDummy.generateDummyCourses()
}