package org.photoforum.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform