package com.sammekleijn.kotlinextensions.extension

import com.google.gson.Gson

fun Any.toJson() : String {
    return Gson().toJson(this)
}