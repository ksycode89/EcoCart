package com.cart.eco.material.service;

import lombok.Data;

@Data
public class MreleDetailVO {
	// 자재출고 상세
	
	private int No; //no
	private int ReleaseNo; // 출고번호
	private String ProCode; //제품코드
	private String ProName; //품명
	private String Standard; //규격
	private String Unit; //단위
	private int RequestNum; //요청수량
	private int ReleaseNum; //출고수량
	private String LotNo; //LOT NO
}
