package com.cart.eco.material.service;

import java.util.List;

public interface MreleService {
	
	// 출고 코드
	public String getReleasecode(MreleaseVO mrele);
	
	//출고현황
	public List<MreleaseVO> selectMrList();
	
	//출고 상세 현황
	public List<MreleDetailVO> dataList(MreleaseVO mrele);
	
}
