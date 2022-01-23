package Skysrd.SpringPractice.controller;

<<<<<<< HEAD

=======
>>>>>>> e03a0b7a5a45bd2646ec207c6b1b2638c601e3c7
import Skysrd.SpringPractice.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

<<<<<<< HEAD
    private  MemberService memberService;

    //Setter Injection
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//        this.memberService = memberService;
//    }

    //Constructor Injection
=======
    private final MemberService memberService;

>>>>>>> e03a0b7a5a45bd2646ec207c6b1b2638c601e3c7
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}