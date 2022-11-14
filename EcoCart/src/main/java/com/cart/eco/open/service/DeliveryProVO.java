package com.cart.eco.open.service;

import java.util.Date;

import lombok.Data;

@Data
public class DeliveryProVO {
	//출고처리(배송처리)
	private String dlivyProCode;	//출고처리코드
	private Date dlivyDate;	//출고처리일자
	private String orderCode;	//주문코드 FK
	private String clientCode;	//거래처코드 FK
	private int allSum;		//총합계액
	private String empNum;	//사원번호 FK
	private String lotCode;	//lot번호
	private String dlivyProSt;	//출고처리상태
	private String dlivyMth;	//출고방법
	private String dlivyCode;	//운송코드
	private String dlivyName;	//출고기사
	private String dlivyPnum;	//기사연락처
}
