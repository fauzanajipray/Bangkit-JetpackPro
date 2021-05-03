package com.dicoding.faprayyy.academy.bookmark

import com.dicoding.faprayyy.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}