package com.cart.eco.common.service;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private java.util.Date proHire;			// 등록일
	private Integer leadTime; 			// 제작소요일
	private Integer bs; 				// 안전재고량
	private Integer ppd; 				// 일생산량
	private Integer proNum;				// 수량
	private Integer cost;  				// 원가
	private Integer sellPrice; 			// 판매단가
	private String standard; 		// 규격
	private String unit; 			// 단위
	private String codeContent;		// 
	
	private String proGet;			// 조달구분
	
}
