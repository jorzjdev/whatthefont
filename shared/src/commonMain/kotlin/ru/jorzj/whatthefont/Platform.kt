package ru.jorzj.whatthefont

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform