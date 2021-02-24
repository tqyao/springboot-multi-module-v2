package com.example.boot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.boot.dao.entity.Member;
import com.example.boot.dao.mapper.MemberMapper;
import com.example.boot.service.MemberService;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

    @Override
    public Member findMember(String id) {
        return getById (id);
    }

    @Override
    public void addMember(Member member) {
        save (member);
    }

    @Override
    public void removeMember(String id) {
        removeById (id);
    }
}
