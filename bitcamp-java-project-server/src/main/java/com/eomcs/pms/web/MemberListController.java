package com.eomcs.pms.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.eomcs.pms.domain.Member;
import com.eomcs.pms.service.MemberService;

@Controller
public class MemberListController {

  @Autowired MemberService memberService;

  @RequestMapping("/member/list")
  public ModelAndView execute() throws Exception {

    List<Member> list = memberService.list();

    ModelAndView mv = new ModelAndView();
    mv.addObject("list", list);
    mv.setViewName("/member/list.jsp");

    return mv;
  }
}
