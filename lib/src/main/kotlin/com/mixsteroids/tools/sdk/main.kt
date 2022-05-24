package com.mixsteroids.tools.sdk

import kotlinx.coroutines.runBlocking

fun main() {
    val mixme = MixMe()
    runBlocking {
//        val a = mixme.mixcloud.user("ajshbhjasbfhkgvfs")
        val a = mixme.mixcloud.user("ndungujan23")
        println(a)
    }
}
