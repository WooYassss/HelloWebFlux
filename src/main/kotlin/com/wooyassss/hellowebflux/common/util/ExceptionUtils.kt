package com.wooyassss.hellowebflux.common.util


fun notFound(
    message: String = ""
): Nothing {
    throw IllegalArgumentException(message)
}