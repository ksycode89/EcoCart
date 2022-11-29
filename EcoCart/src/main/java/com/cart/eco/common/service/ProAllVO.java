package com.cart.eco.common.service;

import java.sql.Date;

import lombok.Data;

@Data
public class ProAllVO {
	
	private String proItem;			// 품목군
	private String codeId;   		// 공통코드 - 아이디
	private String codeName; 		// 공통코드 - 이름
	private String clientCode; 		// 거래처 코드
	private String clientName; 		// 거래처명
	private String proManager; 		// 거래처 담당자 - empNum
	private String empName; 		// 거래처 담당자 이름
	private String proCode;  		// 제품코드
	private String proName;			// 제품명
	private String proGroup; 		// 구분
	private String lotUsed;			// LOT 여부
	private String testUsed; 		// 검사 여부
	private String proHire;			// 등록일
	private int leadTime; 			// 제작소요일
	private int bs; 				// 안전재고량
	private int ppd; 				// 일생산량
	private int proNum;				// 수량
	private int cost;  				// 원가
	private int sellPrice; 			// 판매단가
	private String standard; 		// 규격
	private String unit; 			// 단위
	private String codeContent;		// 
	
	private String proGet;			// 조달구분
	
}
