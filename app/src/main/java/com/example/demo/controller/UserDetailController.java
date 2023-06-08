package com.example.demo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.user.model.MUser;
import com.example.demo.domain.user.service.UserService;
import com.example.demo.form.UserDetailForm;

/**
 * ユーザー詳細画面のコントローラー
 * 
 * @author yukishi
 *
 */
@Controller
@RestController("/user")
public class UserDetailController {
	@Autowired
	private UserService userService;

	@Autowired
	private ModelMapper modelMapper;

	/**
	 * ユーザ詳細画面を表示
	 * 
	 * @param form
	 * @param model
	 * @param userId
	 * @return
	 */
	@GetMapping("/detail/{userId:.+}")
	public String getUser(UserDetailForm form, Model model, @PathVariable("userId") String userId) {
		// ユーザー一件取得
		MUser user = userService.getUserOne(userId);

		// MUserをformに変換
		form = modelMapper.map(user, UserDetailForm.class);

		// Modelに登録
		model.addAttribute("UserDetailForm", form);

		// ユーザー詳細画面を表示
		return "user/detail";
	}
}