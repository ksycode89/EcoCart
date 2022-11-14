package com.cart.eco.common.service;

import java.util.Date;

import lombok.Data;

@Data
public class TestVO {

	private String testCode;	// 검사코드
	private String proCode; 	// 제품코드
	private String proName;		// 품명
	private String testContent; // 검사내용
	private String testPass;	// 합격여부
	private Date testHire;		// 검사일
	private String faultyCode;	// 불량코드
	
}
