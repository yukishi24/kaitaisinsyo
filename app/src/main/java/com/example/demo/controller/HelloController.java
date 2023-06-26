package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * hello.htmlの遷移管理をするコントローラークラス
 * 
 * @author yukishi
 *
 */
@Controller
public class HelloController {

	/**
	 * hello.htmlへの遷移メソッド<br>
	 * url: /hello<br>
	 * 
	 * @return hello.html
	 */
	@GetMapping("/hello")
	public String getHello() {
		return "hello";
	}

	@PostMapping("/hello")
	public String postRequest(@RequestParam("text1") String str, Model model) {
		model.addAttribute("sample", str);
		return "hello/response";
	}
}
