package com.cart.eco.common.service;

import java.sql.Date;

import lombok.Data;

@Data
public class ClientVO {

	private String clientCode;     // 거래처 코드
	private String clientName;    // 거래처명
	private String regNum;            // 사업자번호
	private String workType;     // 업태
	private String sellingType;    // 종목
	private String clientAddr;     // 주소
	private String clientTel;       // 전화번호
	private String clientFax;      // 팩스
	private String clientGrade;      // 등급
	private String clientHire;      // 등급

}
