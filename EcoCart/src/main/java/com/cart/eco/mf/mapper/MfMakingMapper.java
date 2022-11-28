package com.cart.eco.mf.mapper;

import java.util.List;
import java.util.Map;

import com.cart.eco.mf.service.MfMakingVO;

public interface MfMakingMapper {
	
	//생산목록전체조회
	public List<MfMakingVO> getMfResultList();
	
	//공정불량조회
	public List<Map<String, Object>> getMfFaultyList(String mfMakingCode);
	
	//생산지시목록(확정)조회
	public List<MfMakingVO> getMfOrderDecideList();
}
