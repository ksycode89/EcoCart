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
	
	//생산가동조회 - 실시간
	public List<Map<String, Object>> getMfMakingTotal(String mfMakingCode);
	
	//생산가동상세조회 - 실시간
	public List<Map<String, Object>> getMfMakingDetailList(String mfMakingCode);
	
	//생산코드 - 자동입력용
	public List<MfMakingVO> getMfMakingCode();
	
	//생산물품입력
	public int insertMakingProduct(MfMakingVO vo);
	
	//생산가동기본틀입력
	public int insertMakingResult(MfMakingVO vo);
	
	//완제품LOT등록
	public int insertFinishLot(MfMakingVO vo);
	
	//생산가동수치변경
	public int updateMakingResult(MfMakingVO vo);
	
	//주문서수정(생산중->생산완료)
	public int updateOrderFinish(MfMakingVO vo);
	
	//생산계획상태수정(진행->완료)
	public int updateMfPlanFinish(MfMakingVO vo);
	
	//생산지시상태수정(확정->완료)
	public int updateMfOrderFinish(MfMakingVO vo);
	
	//완제품LOT 물품수량 업데이트
	public int updateProductNum(MfMakingVO vo);
	
}
