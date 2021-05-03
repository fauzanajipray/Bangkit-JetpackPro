package com.dicoding.faprayyy.academy.reader

interface CourseReaderCallback {
    fun moveTo(position: Int, moduleId: String)
}