package com.example.demo.hello;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * DBから従業員の検索処理を実行するクラス
 * @Repository	DB操作を行うクラスはリポジトリーとよびこのアノテーションをつけることによって宣言する。
 * 
 * @author yukishi
 *
 */
@Repository
public class HelloReposity {

	/**
	 * SQLを実行する為に、必要なクラス。
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * 引数のidから従業員の情報を取得するメソッド
	 * 
	 * @param id	検索対象のid
	 * @return	検索結果の従業員情報
	 */
	public Map<String, Object> findById(String id) {
		//select文
		String query = "SELECT * FROM employee WHERE id = ?";
		
		//検索実行
		Map<String, Object>Employee = jdbcTemplate.queryForMap(query, id);
		
		return Employee;
	}
}