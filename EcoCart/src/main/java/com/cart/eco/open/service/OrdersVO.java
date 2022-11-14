package com.cart.eco.open.service;

import java.util.Date;

import lombok.Data;

@Data
public class OrdersVO {
	//주문
	private String orderCode;	//주문코드
	private String clientCode;	//거래처코드 FK
	private Date orderDate;	//주문등록일자
	private Date deDate;	//납기일자
	private int allSum;		//총합계액
	private String orderSt;	//진행상태 진행/취소/완료
	
}
