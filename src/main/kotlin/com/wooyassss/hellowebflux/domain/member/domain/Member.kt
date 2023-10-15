package com.wooyassss.hellowebflux.domain.member.domain

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document("members")
data class Member(
    @Id @Field("member_id")
    val id: String? = null,
    val name: String,
    val age: Int,
)
