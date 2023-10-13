package com.wooyassss.hellowebflux

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HelloWebFluxApplication

fun main(args: Array<String>) {
    runApplication<HelloWebFluxApplication>(*args)
}
