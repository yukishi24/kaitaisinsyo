package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	@Autowired
	private HelloService service;

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

	@PostMapping("/hello/db")
	public String postRequest(@RequestParam("text2") String id, Model model) {
		Employee employee = service.getEmployee(id);

		model.addAttribute("employee", employee);
		
		return "hello/db";
	}
}
