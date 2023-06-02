package com.example.demo.controller;

import java.util.Locale;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.application.service.UserApplicationService;
import com.example.demo.domain.user.model.MUser;
import com.example.demo.domain.user.service.UserService;
import com.example.demo.form.GroupOrder;
import com.example.demo.form.SignupForm;

import lombok.extern.slf4j.Slf4j;

/**
 * サインアップ画面に遷移する時の処理を統括するコントローラークラス
 * 
 * @author yukishi
 *
 */
@Controller
@RequestMapping("/user")
@Slf4j
public class SignupController {

	@Autowired
	private UserApplicationService service;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ModelMapper modelMapper;

	/**
	 * ユーザー登録画面を表示
	 * 
	 * @param model
	 * @return /user/signup
	 */
	@GetMapping("/signup")
	public String getSignup(Model model, Locale locale, @ModelAttribute SignupForm form) {
		// 性別を取得
		Map<String, Integer> gender = service.getGenderMap(locale);
		model.addAttribute("gender", gender);
		// ユーザー登録画面に遷移する。
		return "/user/signup";
	}

	/**
	 * ユーザー登録処理
	 * 
	 * @return /login/login
	 */
	@PostMapping("/signup")
	public String postSignup(Model model, Locale locale,@ModelAttribute @Validated(GroupOrder.class) SignupForm form, BindingResult bindingResult) {
		
		//入力チェック
		if(bindingResult.hasErrors()) {
			//NG:ユーザー登録画面にリダイレクト
			return getSignup(model, locale, form);
		}
		log.info(form.toString());
		
		//formをMUserクラスに変換する
		MUser user = modelMapper.map(form, MUser.class);
		
		//ユーザー登録
		userService.signup(user);
		
		// ログイン画面にリダイレクト
		return "redirect:/login";
	}
}
