package com.cart.eco.common.service;

import lombok.Data;

@Data
public class BomChildernVO {

	private int chNo;		// no.
	private String bomCode; // BOM 코드
	private String proCode; // 제품코드
	private String proName; // 자재명
	private int orderNum;   // 정미수량 (로스율 감안 x)
	private int loss;		// 로스율
	private int needNum;	// 필요수량
}
