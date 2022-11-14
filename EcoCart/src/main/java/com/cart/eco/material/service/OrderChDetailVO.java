package com.cart.eco.material.service;

import lombok.Data;

@Data
public class OrderChDetailVO {
	// 입고검사상세
	
	private int No; // no
	private int CheckNo; // 검사번호
	private String ProCode; //제품코드
	private String ProNmae; //제품명
	private String Standard; //규격
	private String Unit; //단위
	private int CheckNum; // 검사수량
	private int ChechPassNum; //합격수량
	private int CheckFailNum; //불합격수량
}
