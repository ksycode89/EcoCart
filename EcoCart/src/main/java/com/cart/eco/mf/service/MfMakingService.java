package com.cart.eco.mf.service;

import java.util.List;
import java.util.Map;

public interface MfMakingService {
	
	//생산목록전체조회
	public List<MfMakingVO> getMfResultList();
	
	//공정불량조회
	public List<Map<String, Object>> getMfFaultyList(String mfMakingCode);
	
	//생산지시목록(확정)조회
	public List<MfMakingVO> getMfOrderDecideList();
	
	//생산물품입력
	public int insertMakingProduct(MfMakingVO vo);
	
	//생산공정기본틀입력
	public int insertMakingResult(MfMakingVO vo);
	
	//생산공정수치변경
	public int updateMakingResult(MfMakingVO vo);
}
