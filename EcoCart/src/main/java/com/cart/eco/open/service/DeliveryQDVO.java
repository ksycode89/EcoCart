package com.cart.eco.open.service;

import lombok.Data;

@Data
public class DeliveryQDVO {
	//출고요청상세
	private int dlivyQno;	//출고요청상세
	private String dlivyQCode;	//출고요청코드 FK
	private String proCode;	//제품코드 FK
	
	private int sellNum;	//주문수량
	private int soldNum;	//남품한 수량
	private int dsellNum; 	//출고 할 수량
	
	private int sumPrice;	//합계액
	
	private int doDlivyNum;

	private String orderCode;
	
	
}	
