package com.cart.eco.material.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MorderVO {
	// 자재발주등록
	
	private int orderNo; //발주번호
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	private Date orderDate; //발주일자
	private String clientCode; //거래처코드
	private String comments; //비고
	private String orderGroup; //구분
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	private Date orderReceiving; //납기일
	private int total; //합계
	private String manager; // 담당자
	
	private String clientName; // 거래처명 조인
	
}
