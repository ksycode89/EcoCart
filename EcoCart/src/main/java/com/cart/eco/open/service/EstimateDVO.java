package com.cart.eco.open.service;

import lombok.Data;

@Data
public class EstimateDVO {
	//견적상세
	private String estmtDno;	//견적상세번호
	private String estmtCode;	//견적코드 FK
	private String proCode;	//제품코드 FK
	private int sellNum;	//수량
	private int sumPrice;	//합계액

}
