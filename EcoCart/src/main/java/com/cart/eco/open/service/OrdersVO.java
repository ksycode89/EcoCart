package com.cart.eco.open.service;




import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class OrdersVO {
	//주문
	private String orderCode;	//주문코드
	private String clientCode;	//거래처코드 FK
	private String clientName;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date orderDate;	//주문등록일자
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date deDate;	//납기일자
	private int allSum;		//총합계액
	private String orderSt;	//진행상태 진행/취소/완료
	private String orderMf; //공정상태 미생산 /생산중/ 생산완료
	
}
