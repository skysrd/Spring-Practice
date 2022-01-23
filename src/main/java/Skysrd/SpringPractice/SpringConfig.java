package Skysrd.SpringPractice;

import Skysrd.SpringPractice.repository.MemberRepository;
import Skysrd.SpringPractice.repository.MemoryMemberRepository;
import Skysrd.SpringPractice.service.MemberService;
<<<<<<< HEAD
=======
import org.springframework.beans.factory.annotation.Configurable;
>>>>>>> e03a0b7a5a45bd2646ec207c6b1b2638c601e3c7
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
