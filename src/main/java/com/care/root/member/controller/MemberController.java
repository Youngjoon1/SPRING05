package com.care.root.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.root.member.dto.MemberDTO;
import com.care.root.member.service.MemberService;

@Controller
public class MemberController {
	@Autowired MemberService ms;
	
	
	
	@GetMapping("index")
	public void index() {}
	
	@GetMapping("login")
	public String login() {
		return "member/login";
	}
	
	@GetMapping("successLogin")
	public String successLogin() {
		return "member/successLogin";
	}
	
	@PostMapping("loginCK")
	public String loginCK(@RequestParam String id,@RequestParam String pw,HttpSession user) {
		if(ms.loginCK(id, pw) == 1) {
			user.setAttribute("user", id);
			
			return "member/successLogin";
		}
		return "redirect:login";
	}
	
	@GetMapping("logout")
	public String logout(HttpSession user) {
		user.invalidate();
		return "index";
	}
	
	@GetMapping("memberInfo")
	public String memberInfo(Model model) {
		model.addAttribute("userList",ms.getList());
		return "member/memberInfo";
	}
	
	@GetMapping("info")
	public String info(@RequestParam String id,Model model) {
		model.addAttribute("info",ms.userInfo(id));
		return "member/info";
	}
	
	@GetMapping("register")
	public String register() {
		
		return "member/register";
	}
	
	@PostMapping("join")
	public String join(MemberDTO dto) {
		ms.insertMember(dto);
		return "redirect:login";
	}
	
	@GetMapping("modify")
	public String modify(Model model,@RequestParam String id) {
		model.addAttribute("info",ms.userInfo(id));
		return "member/modify";
	}
	
	@PostMapping("userModify")
	public String userModify(MemberDTO dto) {
		ms.updateMember(dto);
		return "redirect:memberInfo";
	}
	
	@GetMapping("userDel")
	public String userDel(String id,HttpSession user) {
		ms.memberDel(id);
		if(user.getAttribute("user").equals(id)) {
			user.invalidate();
			return "redirect:login";
		}
		return "redirect:memberInfo";
	}
	
	
	
	
}
