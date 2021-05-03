    package com.dicoding.faprayyy.myviewmodel

    import org.junit.Test

    import org.junit.Assert.*
    import org.junit.Before
    import org.junit.Rule
    import org.junit.rules.ExpectedException

    class MainViewModelTest {

        private lateinit var mainViewModel: MainViewModel

        @Before
        fun init() {
            mainViewModel = MainViewModel()
        }

        @Test
        fun calculate() {
            val width = "1"
            val length = "2"
            val height = "3"
            mainViewModel.calculate(width, height, length)
            assertEquals(6, mainViewModel.result)
        }


        @get:Rule
        var thrown = ExpectedException.none()

        @Test
        @Throws(NumberFormatException::class)
        fun doubleInputCalculateTest() {
            val width = "1"
    //        val length = "2.4"
            val length = "A"
            val height = "3"
        thrown.expect(java.lang.NumberFormatException::class.java)
        thrown.expectMessage("For input string: \"A\"")
//        thrown.expectMessage("For input string: \"2.4\"")
        mainViewModel.calculate(width, height, length)
    }
    @Test
    @Throws(java.lang.NumberFormatException::class)
    fun emptyInputCalculateTest() {
        val width = "1"
        val length = ""
        val height = "3"
        thrown.expect(java.lang.NumberFormatException::class.java)
        thrown.expectMessage("For input string: \"\"")
        mainViewModel.calculate(width, height, length)
    }

}