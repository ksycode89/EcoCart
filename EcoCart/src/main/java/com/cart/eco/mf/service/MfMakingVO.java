package com.cart.eco.mf.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class MfMakingVO {
	private String proCode; //제품코드
	private String proName; //제품명
	private int mfOrderNo; //지시넘버링
	private int mfOrderNum; //지시수량
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date mfOrderDate; //지시일자
	private String mfMakingCode; //생산코드
	private String mfOrderCode; //생산지시코드
	private String mfProcessCode; //공정코드
	private int lineNo; //라인번호
	private int inputNum; //투입량
	private int makingNum; //생산량
	private int faultyNum; //불량량
	@JsonFormat(pattern = "yy-MM-dd hh:mm:ss")
	@DateTimeFormat(pattern="yy-MM-dd hh:mm:ss")
	private Date startTime; //작업시작
	@JsonFormat(pattern = "yy-MM-dd hh:mm:ss")
	@DateTimeFormat(pattern="yy-MM-dd hh:mm:ss")
	private Date endTime; //작업종료
	private String processStatus; //가동상태
	private String faultyCode; //불량코드
	private String faultyContent; //불량내용
}
