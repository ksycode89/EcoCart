package com.cart.eco.open.service;

import lombok.Data;

@Data
public class OrderDVO {
	//주문상세
	private int orderDno;	//주문상세번호
	private String orderCode; 	//주문코드  FK
	private String proCode;	//제품코드 FK
	private int allsellNum;	//총수량
	private int sellNum;	//납품수량
	private int canNum;	//취소수량
	private int sumPrice;	//합계액
}
