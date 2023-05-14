package com.example.demo.hello;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * リポジトリーを使用して、検索処理を実行して結果を取得するクラス。
 * @author yukishi
 *
 */
@Service
public class HelloService {
	@Autowired
	private HelloReposity reposity;
	
	public Employee getEmployee(String id) {
		//検索
		Map<String, Object>map = reposity.findById(id);
		
		//Mapの値を取得
		String employeeId = (String)map.get("id");
		String employeeName = (String)map.get("name");
		int age = (Integer)map.get("age");
		
		//Employeeクラスに格納する
		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employee.setEmployeeName(employeeName);
		employee.setEmployeeAge(age);
		
		return employee;
	}
}
