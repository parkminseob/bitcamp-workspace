package com.eomcs.pms.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.eomcs.pms.service.MemberService;

@Controller
public class MemberDeleteController {

  @Autowired MemberService memberService;

  @RequestMapping("/member/delete")
  public String execute(int no) throws Exception {

    if (memberService.delete(no) == 0) {
      throw new Exception("해당 번호의 회원이 없습니다.");

    }
    return "redirect:list";
  }
}
