package com.cart.eco.material.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class OrderCheckVO {
	// 입고 검사
	
	private int CheckNo; //검사번호
	private int OrderNo; //발주번호
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	private Date CheckDate; // 검사일자
	private String ClientCode; // 거채처코드
	private String Maager; //담당자
	private String WhCode; //창고코드
	
}
