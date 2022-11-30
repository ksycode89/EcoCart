package com.cart.eco.open.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class facilitiesVO {
	private String sysCode;	//설비코드 
	private String sysName; //설비명
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date sysDate;	//설비등록날짜
	private String sysKs;	//설비규격
	private String sysModel; //설비모델
	private String sysMoney;	//설비가격
	private String sysStatus;	//설비상태 사용/미사용 
	private int testCycle;		//점검주기
	private String empNum;		//담당자사번
	
	private String empName;

}
