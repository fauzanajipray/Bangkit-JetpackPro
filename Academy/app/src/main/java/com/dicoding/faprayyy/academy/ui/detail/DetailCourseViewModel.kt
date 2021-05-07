package com.dicoding.faprayyy.academy.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.faprayyy.academy.data.CourseEntity
import com.dicoding.faprayyy.academy.data.ModuleEntity
import com.dicoding.faprayyy.academy.data.source.AcademyRepository

class DetailCourseViewModel(private val academyRepository: AcademyRepository) : ViewModel() {

    private lateinit var courseId: String

    fun setSelectedCourse(courseId: String) {
        this.courseId = courseId
    }

    fun getCourse(): LiveData<CourseEntity> {
        return academyRepository.getCourseWithModules(courseId)
    }

    fun getModules(): LiveData<List<ModuleEntity>> =academyRepository.getAllModulesByCourse(courseId)

}