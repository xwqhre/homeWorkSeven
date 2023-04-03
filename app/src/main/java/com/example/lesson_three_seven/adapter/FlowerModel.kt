package com.example.lesson_three_seven.adapter

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data  class FlowerModel (//data class он имеет больше возможностей длф изменения самого класса
    var name: String,
    var price: Int
    ): Parcelable