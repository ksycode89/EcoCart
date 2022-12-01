package com.cart.eco.mf.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class MfOrderVO {
	private String mfOrderCode; //생산지시코드
	private String mfPlanCode; //생산계획코드
	private String mfPlanName; //생산계획명
	private String mfPlanStatus; //생산계획상태
	private String proCode; //제품코드
	private String proName; //제품명
	private int mfOrderNum; //지시수량
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date mfOrderDate; //지시일자
	private String mfOrderStatus; //진행상황
	private int mfOrderNo; //생산지시카운트
	private String bomCode; //BOM코드
	private int bomNum; //BOM재료갯수
	private int needNum; //필요수량
	private int bomNeedNum; //bomNum*needNum
	private String releaseCode; //출고코드
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date releaseDate; //출고일자
	private int releaseNo; //출고상세번호
	private String lotCode; //LOT번호
	private int restNum; //LOT재고량
	private int requestNum; //요청수량
	private String releaseStatus; //출고상태
	private int lineNo; //라인번호

}
