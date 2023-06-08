package com.example.demo.domain.user.service;

import java.util.List;

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

	/**
	 * ユーザー取得
	 * 
	 * @return
	 */
	public List<MUser> getUsers();
	
	/**
	 * ユーザー取得(1件)
	 * 
	 * @param userId
	 * @return
	 */
	public MUser getUserOne(String userId);
}
