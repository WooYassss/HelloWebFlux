package com.wooyassss.hellowebflux.domain.member.controller

import com.wooyassss.hellowebflux.domain.member.domain.Member
import com.wooyassss.hellowebflux.domain.member.dto.request.SaveMemberRequest
import com.wooyassss.hellowebflux.domain.member.service.MemberService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController(
    private val memberService: MemberService
) {
    @PostMapping("/new")
    suspend fun saveMember(
        @RequestBody req: SaveMemberRequest
    ): Member {
        return memberService.saveMember(req)
    }
}