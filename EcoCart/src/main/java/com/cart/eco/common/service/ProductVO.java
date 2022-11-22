package com.cart.eco.common.service;

import java.util.Date;

import lombok.Data;

@Data
public class ProductVO {

	private String proCode;		// 제품코드
	private String proName; 	// 제품명
	private String proItme;     // 품목군
	private String proGroup; 	// 구분
	private String proGet; 		// 조달구분
	private String lotUsed; 	// LOT 사용여부
	private String testUsed; 	// 검사여부
	private Date proHire;		// 등록일
	private int proNum;			// 수량
	private String whCode;		// 창고코드
	
	private int sellPrice;
}
