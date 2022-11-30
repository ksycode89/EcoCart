package com.cart.eco.material.service;

import lombok.Data;

@Data
public class ReDetailVO {
	// 입고상세
	
	private int ReceivingNo;
	private String ReceivingCode;
	private String ProCode;
	private String ProName;
	private String Standard;
	private String Unit;
	private int SellPrive;
	private int OrderNum;
	private int TotalPrice;
	private String LotCode;
	private String WhCode;
	
	private int orderNo;
}
