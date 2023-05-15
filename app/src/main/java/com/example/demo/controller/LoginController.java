package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ログイン画面に遷移する処理を統括するコントローラークラス。
 * 
 * @author yukishi
 *
 */
@Controller
public class LoginController {

	/**
	 * ログイン画面に遷移する。
	 * 
	 * @return
	 */
	@GetMapping("/login")
	public String getLogin() {
		return "/login/login";
	}
}
