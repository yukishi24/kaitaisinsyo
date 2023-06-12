package com.example.demo.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("/user")
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
		user.setPassword(null);
		// MUserをformに変換
		form = modelMapper.map(user, UserDetailForm.class);

		// Modelに登録
		model.addAttribute("userDetailForm", form);

		// ユーザー詳細画面を表示
		return "user/detail";
	}

	/**
	 * ユーザー更新
	 * 
	 * @param form
	 * @param model
	 * @return
	 */
	@PostMapping(value = "/detail", params = "update")
	public String updateUser(UserDetailForm form, Model model) {
		// ユーザー更新
		userService.updateUserOne(form.getUserId(), form.getPassword(), form.getUserName());

		// ユーザー一覧画面にリダイレクト
		return "redirect:/user/list";
	}

	/**
	 * ユーザー削除処理
	 * 
	 * @param form
	 * @param model
	 * @return
	 */
	@PostMapping(value = "/detail", params = "delete")
	public String deleteUserOne(UserDetailForm form, Model model) {

		// ユーザーを削除
		userService.deleteUserOne(form.getUserId());

		// ユーザー一覧画面にリダイレクト
		return "redirect:/user/list";
	}
}