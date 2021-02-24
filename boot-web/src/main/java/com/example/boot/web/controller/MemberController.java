package com.example.boot.web.controller;

import com.example.boot.dao.entity.Member;
import com.example.boot.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/str")
    public String getString(){
        return "hello world!";
    }

    @GetMapping("/member/{id}")
    public Member findMember(@PathVariable String id){
         return memberService.findMember (id);
    }

    @PostMapping("/member")
    public String add(@RequestBody Member member){
        memberService.addMember (member);
        return "success!";
    }
}
