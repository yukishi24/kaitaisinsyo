package com.example.demo.domain.user.service;

import com.example.demo.domain.user.model.MUser;

/**
 * ユーザーサービスのインターフェース
 * 
 * @author yukishi
 *
 */
public interface UserService {
	/**
	 * ユーザー登録
	 * 
	 * @param mUser
	 */
	public void signup(MUser mUser);
}
