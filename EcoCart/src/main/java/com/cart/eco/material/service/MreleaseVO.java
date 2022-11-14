package com.cart.eco.material.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MreleaseVO {
	// 자재 출고
	
	private int ReleaseNo; //출고번호
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	private Date ReleaseData; //출고일자
	private String WhCode; //창고코드
	private String ReleaseWhSpace; //출고장소
	private String Manager; //담당자
	private String Comments; //비고
	private String Process; //공정
	private String ReleaseRequest; //출고요청
}
