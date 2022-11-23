package com.cart.eco.open.service;





import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class EstimateVO {
	//견적
	private String estmtCode;	//견적코드
	private String clientCode;	//거래처코드 FK 
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date estmtDate; 	//견적일자	
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date deDate;	//납기일자
	
	private String estmtSt;	//승인여부 
	private int allSum;		//총합계액
	
	private String fallSum;
	private int sellPrice;
	
	
	
}
