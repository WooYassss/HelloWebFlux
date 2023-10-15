package com.wooyassss.hellowebflux.domain.hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    // suspend를 사용한 코루틴 사용

    @GetMapping("/hello")
    suspend fun hello(
        @RequestParam(required = false) name: String = "GGos3"
    ): String {
        return "$name 님 안녕하세요."
    }
}