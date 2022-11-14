package com.cart.eco.common.service;

import java.util.Date;

import lombok.Data;

@Data
public class BomVO {

	private String bomCode;		// BOM 코드
	private String proCode;		// 제품코드
	private Date bomHire;		// 시작일
	private Date bomFire;		// 종료일
	private int bomNeedDay;		// 제작소요일
	private int totalPrice;		// 총단가
	private String bomManager;  // 담당자
}
