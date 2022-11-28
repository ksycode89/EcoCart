package com.cart.eco.material.mapper;

import java.util.List;

import com.cart.eco.material.service.MreleDetailVO;
import com.cart.eco.material.service.MreleaseVO;

public interface MreleMapper {
	
	// 출고 코드
	public String getReleasecode(MreleaseVO mrele);
	
	//출고현황
	public List<MreleaseVO> selectMrList();
	
	//출고 상세 현황
	public List<MreleDetailVO> dataList(MreleaseVO mrele);
	
}
