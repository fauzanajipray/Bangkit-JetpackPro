package com.dicoding.faprayyy.academy.data.source.remote.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ContentResponse(
        var moduleId: String,
        var content: String
) : Parcelable
