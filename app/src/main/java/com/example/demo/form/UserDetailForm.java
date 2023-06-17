package com.example.demo.form;

import java.util.Date;

import lombok.Data;

/**
 * ユーザー詳細画面のフォームクラス
 * 
 * @author yukishi
 *
 */
@Data
public class UserDetailForm {
	private String userId;
	private String password;
	private String userName;
	private Date birthday;
	private Integer age;
	private Integer gender;
}
