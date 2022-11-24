package com.cart.eco.material.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class MorderVO {
	// 자재발주등록
	
	private int orderNo; //발주번호
	@JsonFormat(pattern="yyyy-MM-dd") 
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	private Date orderDate; //발주일자
	private String clientCode; //거래처코드
	private String comments; //비고
	private String orderGroup; //구분
	@JsonFormat(pattern="yyyy-MM-dd") 
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	private Date orderReceiving; //납기일
	private int total; //합계
	private int empNum; // 담당자사번
	private String empName; // 담당자이름
	
	private String clientName; // 거래처명 조인
	private String proItme; // 품목군
	private String proName; // 제품명
	private int cost; // 원가
	private int sellPrice; // 단가
	private String standard; // 규격
	private String proCode; // 제품코드
	private String unit;
	private String empDept;
}
