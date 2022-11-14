package com.cart.eco.common.service;

import lombok.Data;

@Data
public class ProOptionVO {
	
	private String proCode;		// 제품코드
	private int leadTime;		// lead time
	private int bs;				// 안전재고량
	private int ppd;			// 일생산량
	private String clientCode; 	// 거래처코드
	private String proManager;  // 담당자
	private int cost; 			// 원가
	private int sellPrice; 		// 단가
	private String standard;	// 규격
}
