package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.domain.user.model.MUser;

/**
 * ユーザーマスタテーブル用のリポジトリークラス
 * 
 * @author yukishi
 *
 */
@Mapper
public interface UserMapper {

	/**
	 * ユーザー登録
	 * 
	 * @param mUser
	 * @return
	 */
	public int insertOne(MUser mUser);

	/**
	 * ユーザー取得(複数)
	 * 
	 * @param user
	 * @return
	 */
	public List<MUser> findMany(MUser user);

	/**
	 * ユーザー取得一件
	 * 
	 * @return
	 */
	public MUser findOne(String userId);

	/**
	 * ユーザー更新(1件)
	 * 
	 * @param userId
	 * @param password
	 * @param userName
	 */
	public void updateOne(@Param("userId") String userId, @Param("password") String password,
			@Param("userName") String userName);

	/**
	 * ユーザー削除(1件)
	 * 
	 * @param userId
	 * @return
	 */
	public int deleteOne(@Param("userId") String userId);
}
