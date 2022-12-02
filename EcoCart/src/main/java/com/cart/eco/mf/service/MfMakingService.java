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
	
	//생산가동조회 - 실시간
	public List<Map<String, Object>> getMfMakingTotal(String mfMakingCode);
		
	//생산가동상세조회 - 실시간
	public List<Map<String, Object>> getMfMakingDetailList(String mfMakingCode);
	
	//생산코드 - 자동입력용
	public List<MfMakingVO> getMfMakingCode();
	
	//생산물품입력
	public int insertMakingProduct(List<MfMakingVO> vo);
	
	//완제품LOT등록 & 제품수량업데이트
	public int mfFinishLot(List<MfMakingVO> vo);
	
	//생산공정기본틀입력
	public int insertMakingResult(List<MfMakingVO> vo);
	
	//생산공정수치변경
	public int updateMakingResult(List<MfMakingVO> vo);
	
	//생산계획 & 지시상태수정(진행->완료)
	public int updateMfFinish(List<MfMakingVO> vo);
}
