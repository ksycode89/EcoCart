package com.cart.eco.material.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MorderVO {
	// 자재발주등록
	
	private int OrderNo; //발주번호
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	private Date OrderDate; //발주일자
	private String ClientCode; //거래처코드
	private String Comments; //비고
	private String OrderGroup; //구분
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	private Date OrderReceiving; //입고일
	private int Total; //합계
	private String Manger; // 담당자
	
}
