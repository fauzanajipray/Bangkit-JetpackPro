package com.dicoding.faprayyy.academy.ui.bookmark

import com.dicoding.faprayyy.academy.data.CourseEntity

interface BookmarkFragmentCallback {
    fun onShareClick(course: CourseEntity)
}