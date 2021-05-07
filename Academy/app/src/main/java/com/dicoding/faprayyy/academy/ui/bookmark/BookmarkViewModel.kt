package com.dicoding.faprayyy.academy.ui.bookmark

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.faprayyy.academy.data.CourseEntity
import com.dicoding.faprayyy.academy.data.source.AcademyRepository

class BookmarkViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    fun getBookmark(): LiveData<List<CourseEntity>> = academyRepository.getBookmarkedCourses()
}