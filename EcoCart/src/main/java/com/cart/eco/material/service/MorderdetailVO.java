package com.cart.eco.material.service;

import lombok.Data;

@Data
public class MorderdetailVO {
	// 발주상세내역
	
	private int No;  // 번호
	private int OrderNo; // 발주번호
	private String ProCode; //제품코드
	private String ProNmae; //제품명
	private String Standard; //규격
	private String Unit; //단위
	private String CheckYn; //검사여부
	private int SellPrice; // 단가
	private int OrderNum; // 발주수량
	private int OrderRemNum; //발주잔량
	private int SumPrice; // 공급가액
	
		
}
