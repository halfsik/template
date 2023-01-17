package com.app.domain.member.entity;

import com.app.domain.common.BaseEntity;
import com.app.domain.member.constant.MemberType;
import com.app.domain.member.constant.Role;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
//무분별한 생성을 막기위해 protected

@NoArgsConstructor(access = AccessLevel.PROTECTED) // 엔티티는 기본생성자가 항상 있어야함
public class Member extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false,length  = 10)
    private MemberType memberType;

    @Column(unique = true, length = 50,nullable = false)
    private String email;


    @Column(length = 200)
    private String password;

    @Column(nullable = false,length = 20)
    private String memeberName;


    @Column(length = 200)
    private String profile;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false,length  = 10)
    private Role role;


    @Column(length = 250)
    private String refreshToken;

    private LocalDateTime tokenExpirationTime;
}


