package com.cart.eco.material.service;

import java.util.List;

public interface MorderService {
	
	// 입력될 자재발주번호
	public int getOrderNo(); 
	
	// 발주현황
	public List<MorderVO> selectOrderList();
	
	// 발주등록
	

}
