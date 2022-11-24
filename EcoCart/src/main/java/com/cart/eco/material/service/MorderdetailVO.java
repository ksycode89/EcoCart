package com.cart.eco.material.service;

import lombok.Data;

@Data
public class MorderdetailVO {
	// 발주현황
	
	private int no;  // 번호
	private int orderNo; // 발주번호
	private String proCode; //제품코드
	private String proName; //제품명
	private String standard; //규격
	private String unit; //단위
	private String checkYn; //검사여부
	private int sellPrice; // 단가
	private int orderNum; // 발주수량
	private int orderRemNum; //발주잔량
	private int sumPrice; // 공급가액
	
	
	private int checkNum; //조인검사수량
	private String proItme;
	private int empNum; //담당자 사번
	private String empName; //담당자이름
	private String clientCode; // 거래처명 조인
}
