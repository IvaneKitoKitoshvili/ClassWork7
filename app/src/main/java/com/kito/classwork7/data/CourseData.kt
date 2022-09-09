package com.kito.classwork7.data


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CourseData(
    @Json(name = "active_courses")
    val activeCourses: List<ActiveCourse?>?,
    @Json(name = "new_courses")
    val newCourses: List<NewCourse?>?
)