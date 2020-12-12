package com.eomcs.pms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

@Controller
public class MemberUpdateController {

  @Autowired MemberService memberService;

  @RequestMapping("/member/update")
  public String execute(Member member) throws Exception {

    memberService.update(member);
    return "redirect:list";
  }
}
