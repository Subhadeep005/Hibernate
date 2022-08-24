package com.codingraja.sunelectronics.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	private static final String LOGIN_PAGE = "account/login";

	@GetMapping("/login")
	public ModelAndView loginPage() {
		return new ModelAndView(LOGIN_PAGE);
	}
}
