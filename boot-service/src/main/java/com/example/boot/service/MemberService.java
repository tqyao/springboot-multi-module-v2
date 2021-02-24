package com.example.boot.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.example.boot.dao.entity.Member;
import org.springframework.stereotype.Service;


public interface MemberService extends IService<Member> {

    Member findMember(String id);

    void addMember(Member member);

    void removeMember(String id);
}
