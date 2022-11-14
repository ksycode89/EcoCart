package com.cart.eco.mf.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MfPlanVO {
	private String mfPlanCode; //생산계획코드
	private String mfPlanName; //생산계획명
	private String orderCode; //주문코드
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date mfPlanDate; //계획일자
	private String mfPlanStatus; //진행상황
	private String proCode; //제품코드
	private String proName; //제품명
	private int needNum; //필요수량
	private int totalOrderNum; //총지시수량
}
