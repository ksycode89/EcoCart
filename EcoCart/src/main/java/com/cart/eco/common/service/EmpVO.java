package com.cart.eco.common.service;

import java.util.Date;

import lombok.Data;

@Data
public class EmpVO {

	private String empNum;  // 사원번호
	private String empName; // 이름
	private String empMail;   // 메일
	private String empTel;    // 전화번호
	private Date empHire;    // 입사일
	private String empDept; // 부서
	private int empSalary;    // 월급
	private String empManager; // 담당자
	private String empId;         // 아이디
	private String empPw;       // 비번
}
