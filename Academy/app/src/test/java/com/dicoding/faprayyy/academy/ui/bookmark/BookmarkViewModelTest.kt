package com.dicoding.faprayyy.academy.ui.bookmark

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.dicoding.faprayyy.academy.data.CourseEntity
import com.dicoding.faprayyy.academy.data.source.AcademyRepository
import com.dicoding.faprayyy.academy.ui.bookmark.BookmarkViewModel
import com.dicoding.faprayyy.academy.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class BookmarkViewModelTest {
    private lateinit var viewModel: BookmarkViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var academyRepository: AcademyRepository

    @Mock
    private lateinit var observer: Observer<List<CourseEntity>>


    @Before
    fun setUp() {
        viewModel = BookmarkViewModel(academyRepository)
    }


    @Test
    fun getBookmark() {

        val dummyCourses = DataDummy.generateDummyCourses()
        val courses = MutableLiveData<List<CourseEntity>>()
        courses.value = dummyCourses

        Mockito.`when`(academyRepository.getBookmarkedCourses()).thenReturn(courses)
        val courseEntities = viewModel.getBookmark().value
        verify(academyRepository).getBookmarkedCourses()
        assertNotNull(courseEntities)
        assertEquals(5, courseEntities?.size)

        viewModel.getBookmark().observeForever(observer)
        verify(observer).onChanged(dummyCourses)
    }
}