package com.cart.eco.mf.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class MfOrderVO {
	private String mfOrderCode; //생산지시코드
	private String mfPlanCode; //생산계획코드
	private String proCode; //제품코드
	private String proName; //제품명
	private int mfOrderNum; //지시수량
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date mfOrderDate; //지시일자
	private String mfOrderStatus; //진행상황
	private int mfOrderNo; //생산지시카운트
	private String bomCode; //BOM코드

}
