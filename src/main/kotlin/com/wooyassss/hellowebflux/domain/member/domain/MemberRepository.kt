package com.wooyassss.hellowebflux.domain.member.domain

import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Mono


interface MemberRepository : ReactiveCrudRepository<Member, String> {
    fun findByName(name: String): Mono<Member?>
}