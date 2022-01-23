package Skysrd.SpringPractice;

import Skysrd.SpringPractice.repository.MemberRepository;
import Skysrd.SpringPractice.repository.MemoryMemberRepository;
import Skysrd.SpringPractice.service.MemberService;

import org.springframework.beans.factory.annotation.Configurable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

//    @Bean
//    public MemberService memberService() {
//        return new MemberService(memberRepository());
//    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
