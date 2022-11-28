package com.cart.eco.material.service;




import lombok.Data;

@Data
public class MreleDetailVO {
	// 자재출고 상세
	
	private int no; //no
	private int releaseNo; // 출고번호
	private String proCode; //제품코드
	private String releaseCode; //출고코드
	private String ProName; //자재명
	private String standard; //규격
	private String unit; //단위
	private int requestNum; //요청수량
	private int releaseNum; //출고수량
	private String lotCode; //LOT NO
	
	
	private String releaseStatus;
	
}
