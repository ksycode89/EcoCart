package com.cart.eco.common.service;



import java.sql.Date;

import lombok.Data;

@Data
public class WHVO {
	private String whCode;		// 창고코드
	private String whName;		// 창고명
	private String whField;		// 창고분류
	private String whExplain;	// 창고설명
	private String whUsed; 		// 창고 사용여부
	private Date whHire;		// 등록일
	private String whManager; 	// 담당자
	private String comments; 	// 비고
}
