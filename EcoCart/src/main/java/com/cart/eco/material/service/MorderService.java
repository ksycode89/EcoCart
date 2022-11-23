package com.cart.eco.material.service;

import java.util.List;

public interface MorderService {
	
	// 입력될 자재발주번호
	public int getOrderNo(MorderVO morderVO); 
	
	// 발주현황
	public List<MorderVO> selectOrderList();
	
	// 발주상세현황
	public List<MorderdetailVO> detailList(MorderVO morderVO);
	
	// 발주등록목록 기본값
	public List<MorderVO> proInfo(MorderVO morderVO);
	
	// 발주등록
	public int insertOrder(List<MorderVO> morderVO);
	
	public int insertOrder1(List<MorderVO> morderVO);

	// 발주삭제
	public int deleteOrder(MorderVO morderVO);
	
}
