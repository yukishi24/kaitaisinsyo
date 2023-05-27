package com.example.demo.form;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 画面の入力内容とマッピングするレコードクラス
 * 
 * @author yukishi
 *
 */
public record SignupForm(
		String userId,
		String password,
		String userName,
		@DateTimeFormat(pattern = "yyyy/mm/dd")
		Date birthday,
		Integer age,
		Integer gender
		) {

}
