package com.linus.muzicvia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform