package com.example.demo.application.service;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * 性別のマップを生成するサービスクラス
 * 
 * @author yukishi
 *
 */
@Service
public class UserApplicationService {
	
	/**
	 * 性別のマップを生成する。
	 * 
	 * @return		"男性" , 1<br>
	 * 				"女性" , 2
	 */
	public Map<String, Integer> getGenderMap() {
		Map<String, Integer>genderMap = new LinkedHashMap<>();
		genderMap.put("男性", 1);
		genderMap.put("女性", 2);
		return genderMap;
	}
}
