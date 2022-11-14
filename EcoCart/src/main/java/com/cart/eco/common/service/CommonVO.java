package com.cart.eco.common.service;

import lombok.Data;

@Data
public class CommonVO {

	private String codeId;		// 코드 아이디
	private String codeName;	// 코드명
	private String codeGroup;	// 코드분류
	private String codeContent; // 코드내용
	private String codeUsed;	// 사용여부
}
