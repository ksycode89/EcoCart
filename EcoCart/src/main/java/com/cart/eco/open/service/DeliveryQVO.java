package com.cart.eco.open.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class DeliveryQVO {
	//출고요청
	private String dlivyQCode;	//출고요청코드
	private String orderCode;	//주문코드 FK
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dlivyDate;	//출고요청일자
	private String clientCode;	//거래처코드 FK
	private String clientName;
	private String empNum;	//사원번호 FK
	private int allSum;		//총합계액
	private String dlivyQSt; 	//출고요청상태
	
	
}
