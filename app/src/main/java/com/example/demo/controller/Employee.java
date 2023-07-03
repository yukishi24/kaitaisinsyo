package com.example.demo.controller;

import lombok.Data;

/**
 * 検索結果を入れるクラス
 * 
 * @author yukishi
 *
 */
@Data
public class Employee {
	private String employeeId;
	private String employeeName;
	private int employeeAge;
}
