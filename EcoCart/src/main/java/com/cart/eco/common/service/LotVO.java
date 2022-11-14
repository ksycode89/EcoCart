package com.cart.eco.common.service;

import java.util.Date;

import lombok.Data;

@Data
public class LotVO {

		private String lotCode;		// LOT 번호
		private String proCode; 	// 제품코드
		private String proName; 	// 제품명
		private String proGroup; 	// 분류
		private Date lotHire; 		// 등록일
		private String lotManager;  // 담당자
		private int lotBundle;		// 단위
		private String lotSpace; 	// 위치
		private int lotNum; 		// 수량
}
