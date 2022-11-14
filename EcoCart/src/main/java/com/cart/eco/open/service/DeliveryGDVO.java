package com.cart.eco.open.service;

import lombok.Data;

@Data
public class DeliveryGDVO {
	//출고등록상세
	private int dlivyGno;	//출고등록상세
	private String dlivyGCode;	//출고등록코드 FK
	private String proCode;	//제품코드 FK
	private int sellNum;	//수량
	private int sumPrice;	//합계액
}
