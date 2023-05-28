package com.arstagaev.testkmm9

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {

        return "Hello, ${platform.name}!"
    }
}