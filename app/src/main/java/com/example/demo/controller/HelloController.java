package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
