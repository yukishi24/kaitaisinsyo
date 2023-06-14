package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.user.model.MUser;
import com.example.demo.domain.user.service.UserService;
import com.example.demo.form.UserDetailForm;
import com.example.demo.form.UserListForm;

/**
 * ユーザー一覧画面用コントローラー
 * 
 * @author yukishi
 *
 */
@Controller
@RequestMapping("/user")
public class UserListController {

	@Autowired
	private UserService userService;

	@Autowired
	private ModelMapper mapper;

	/**
	 * ユーザー一覧画面を表示する
	 * 
	 * @return
	 */
	@GetMapping("/list")
	public String getUserList(@ModelAttribute UserDetailForm userDetailForm, Model model) {

		// formをMUserクラスに変換
		MUser user = mapper.map(model, MUser.class);

		// ユーザー検索
		List<MUser> userList = userService.getUsers(user);

		// Modelに登録
		model.addAttribute("userList", userList);

		return "/user/list";
	}

	/**
	 * ユーザー検索処理
	 * 
	 * @param userListForm
	 * @param model
	 * @return
	 */
	@PostMapping("/list")
	public String postUserList(@ModelAttribute UserListForm userListForm, Model model) {

		// fromをMUserクラスに変更する。
		MUser user = mapper.map(userListForm, MUser.class);

		// ユーザー検索
		List<MUser> userList = userService.getUsers(user);

		// modelに登録
		model.addAttribute("userList", userList);

		// ユーザー一覧表示
		return "user/list";
	}
}
