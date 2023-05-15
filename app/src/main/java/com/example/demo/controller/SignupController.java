package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.application.service.UserApplicationService;

/**
 * サインアップ画面に遷移する時の処理を統括するコントローラークラス
 * 
 * @author yukishi
 *
 */
@Controller
@RequestMapping("/user")
public class SignupController {
	
	@Autowired
	private UserApplicationService service;
	
	/**
	 * ユーザー登録画面を表示
	 * 　
	 * @param model
	 * @return	/user/signup
	 */
	@GetMapping("/signup")
	public String getSignup(Model model) {
		//性別を取得
		Map<String, Integer>gender = service.getGenderMap();
		model.addAttribute(gender);
		
		//ユーザー登録画面に遷移する。
		return "/user/signup";
	}
	
	/**
	 * ユーザー登録処理
	 * 
	 * @return	/login/login
	 */
	@PostMapping("/signup")
	public String postSignup() {
		//ログイン画面にリダイレクト
		return "redirect:/login";
	}
}
