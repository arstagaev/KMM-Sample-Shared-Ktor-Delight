package com.arstagaev.testkmm9

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform