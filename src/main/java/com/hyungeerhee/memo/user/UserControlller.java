package com.hyungeerhee.memo.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserControlller {
	
	@GetMapping("/user/join-view")
	public String inputJoin() {
		return "user/join";
	}
	
}
