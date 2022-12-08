package com.cart.eco.material.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class MreleaseVO {
	// 자재 출고
	
	private int releaseNo; //출고번호
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date releaseDate; //출고일자
	private String whCode; //창고코드
	private String releaseWhSpace; //출고장소
	private String manager; //담당자
	private String comments; //비고
	private String process; //공정
	private String releaseRequest; //출고요청
	
	private String releaseCode; //출고코드
	private String mfOrderCode; //생산지시코드
	private String lotCode; //LOT NO
	private String ProName; //자재명
	private String releaseStatus;
	private String proCode; //제품코드
	
	private int rn;
}
