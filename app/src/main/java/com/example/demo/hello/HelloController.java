package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * hello用のコントローラー
 * @Controller
 * 				Httpリクエストを受け取るクラスをコントローラーと呼ぶ<br>
 * 				このアノテーションをつけるとコントローラーとなる。
 * @author yukishi
 *
 */
@Controller
public class HelloController {

	/**
	 * hello.htmlに遷移するメソッド
	 * @GetMapping(path)　http://localhost/helloのリクエストで実行する。
	 * @return
	 */
	@GetMapping("/hello")
	public String getHello() {
		return "hello";
	}
}
