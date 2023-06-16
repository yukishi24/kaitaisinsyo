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
	public void signup(MUser user);

	/**
	 * ユーザー取得
	 * 
	 * @return
	 */
	public List<MUser> getUsers(MUser user);

	/**
	 * ユーザー取得(1件)
	 * 
	 * @param userId
	 * @return
	 */
	public MUser getUserOne(String userId);

	/**
	 * ユーザー更新(1件)
	 * 
	 * @param userId
	 * @param password
	 * @param userName
	 */
	public void updateUserOne(String userId, String password, String userName);

	/**
	 * ユーザー削除(1件)
	 * 
	 * @param userId
	 */
	public void deleteUserOne(String userId);
}
