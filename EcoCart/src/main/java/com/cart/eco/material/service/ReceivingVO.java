package com.cart.eco.material.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ReceivingVO {
	// 자재입고
	
	private String ReceivingCode; //입고번호
	private int OrderNo; // 발주번호
	@JsonFormat(pattern="yyyy-MM-dd") 
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date ReceivingDate; // 입고일자
	private String ClientCode; // 거래처코드
	private String Manager; //담당자
	private String Comments; // 비고
	
}
