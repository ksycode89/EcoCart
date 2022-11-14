package com.cart.eco.common.service;

import lombok.Data;

@Data
public class FcVO {

	private String faultyCode;		// 불량코드
	private String faultyContent; 	// 불량내용
	private String faultyType;		// 불량분류
}
