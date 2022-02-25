package Skysrd.SpringPractice;

import Skysrd.SpringPractice.repository.JdbcMemberRepository;
import Skysrd.SpringPractice.repository.MemberRepository;
import Skysrd.SpringPractice.repository.MemoryMemberRepository;
import Skysrd.SpringPractice.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.support.DatabaseStartupValidator;

import javax.sql.DataSource;
import javax.xml.crypto.Data;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource=dataSource;
    }

//    @Bean
//    public MemberService memberService() {
//        return new MemberService(memberRepository());
//    }

    @Bean
    public MemberRepository memberRepository() {
        return new JdbcMemberRepository(dataSource);
    }
}
