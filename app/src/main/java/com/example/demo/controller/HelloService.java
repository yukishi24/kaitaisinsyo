package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * SQLの実行結果を取得する。
 * 
 * @author yukishi
 *
 */
@Service
public class HelloService {

	@Autowired
	private HelloRepository repository;

	public Employee getEmployee(String id) {
		Map<String, Object> map = repository.findId(id);

		String employeeId = (String) map.get("id");
		String name = (String) map.get("name");
		int age = (Integer) map.get("age");

		Employee employee = new Employee();
		employee.setEmployeeId(employeeId);
		employee.setEmployeeName(name);
		employee.setEmployeeAge(age);

		return employee;
	}
}
