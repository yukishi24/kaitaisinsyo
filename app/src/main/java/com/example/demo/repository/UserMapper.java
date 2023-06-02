package com.example.demo.repository;

import org.apache.ibatis.annotations.Mapper;

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
}
