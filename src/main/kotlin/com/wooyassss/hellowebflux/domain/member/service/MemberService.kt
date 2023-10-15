package com.wooyassss.hellowebflux.domain.member.service

import com.wooyassss.hellowebflux.domain.member.domain.Member
import com.wooyassss.hellowebflux.domain.member.domain.MemberRepository
import com.wooyassss.hellowebflux.domain.member.dto.request.SaveMemberRequest
import com.wooyassss.hellowebflux.common.util.notFound
import kotlinx.coroutines.reactor.awaitSingle
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {
    suspend fun findById(id: String): Member {
        return memberRepository.findById(id)
            .switchIfEmpty(Mono.empty())
            .awaitSingle()
            ?: notFound("$id 는 존재하지 않는 유저 입니다.")
    }

    fun saveMember(req: SaveMemberRequest): Member {
        return memberRepository.save(
            Member(name = req.name, age = req.age)
        ).block()!!
    }
}