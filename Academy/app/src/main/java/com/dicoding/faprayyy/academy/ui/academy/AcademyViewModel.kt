package com.dicoding.faprayyy.academy.ui.academy

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.faprayyy.academy.data.CourseEntity
import com.dicoding.faprayyy.academy.data.source.AcademyRepository

class AcademyViewModel(private val academyRepository: AcademyRepository): ViewModel() {

    fun getCourses(): LiveData<List<CourseEntity>> = academyRepository.getAllCourses()


}