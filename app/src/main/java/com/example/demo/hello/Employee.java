package com.example.demo.hello;

import lombok.Data;

/**
 * 検索結果を入れるクラス<br>
 * mysqlのemployeeテーブルのカラムを参照してください。
 * @Data	lombokのアノテーションで宣言したフィールで、<br>
 * 			getter,setter.toString,hashCode,equalsメソッドを自動で実装する。
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
