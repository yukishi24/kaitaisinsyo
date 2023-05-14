package com.example.demo.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@Autowired
	private HelloService service;

	/**
	 * hello.htmlに遷移するメソッド
	 * @GetMapping(path)　http://localhost/helloのリクエストで実行する。
	 * @return
	 */
	@GetMapping("/hello")
	public String getHello() {
		return "hello";
	}
	
	/**
	 * hello.htmlから受け取った文字列をModelに追加してresponse.htmlに遷移する。
	 * <br>
	 * @PostMapping("/hello")httpからのpostリクエストを受け取るアノテーション。<br>
	 * @RequestParam("text1")String str	画面で入力されたパラメータを受け取るアノテーション
	 * @param str	hello.htmlのformから受け取る文字列。
	 * @param model	response.htmlに送るためのmodel
	 * @return		/hello/response.html
	 */
	@PostMapping("/hello")
	public String postRequest(@RequestParam("text1")String str, Model model) {
		
		// 画面から受け取った文字列をModelに追加する。
		model.addAttribute("sample",str);
		
		// response.htmlに遷移する。
		return "/hello/response";
	}
	
	/**
	 * クエリを実行した結果をdb.htmlに表示する。
	 * @param 	id 検索対象のid
	 * @param 	model	画面にデータを保持して遷移する。
	 * @return	db.html
	 */
	@PostMapping("/hello/db")
	public String postDbRequest(@RequestParam("text2")String id, Model model) {
		
		//1件検索
		Employee employee = service.getEmployee(id);
		
		//検索結果をModelに登録
		model.addAttribute("employee", employee);
		
		//db.htmlに遷移
		return "/hello/db";
	}
}