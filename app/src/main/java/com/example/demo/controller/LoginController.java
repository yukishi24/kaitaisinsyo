package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

	/**
	 * ユーザー一覧画面にリダイレクト
	 * 
	 * @return
	 */
	@PostMapping("/login")
	public String postLogin() {
		return "redirect:/user/list";
	}
}
