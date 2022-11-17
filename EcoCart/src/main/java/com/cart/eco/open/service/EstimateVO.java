package com.cart.eco.open.service;



import java.sql.Date;

import lombok.Data;

@Data
public class EstimateVO {
	//견적
	private String estmtCode;	//견적코드
	private String clientCode;	//거래처코드 FK 
	private Date estmtDate; 	//견적일자	
	private Date deDate;	//납기일자
	private String estmtSt;	//승인여부 
	private int allSum;		//총합계액
	
	
	
	
	
	
	
}
