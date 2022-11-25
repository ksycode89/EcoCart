package com.cart.eco.mf.service;

import lombok.Data;

@Data
public class MfProcessVO {
	private String mfProcessCode; //공정코드
	private String mfProcessName; //공정명
	private String sysCode; //설비코드 - 설비이름
	private String sysName; //설비이름
	private int lineNo; //라인번호
	private String empNum; //작업자번호 - 작업자이름 불러오는 용도
	private String empName; //작업자명
	private String sysStatus; //설비사용여부
}
