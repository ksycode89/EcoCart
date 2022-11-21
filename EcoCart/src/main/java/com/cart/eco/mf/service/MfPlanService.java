package com.cart.eco.mf.service;

import java.util.List;

public interface MfPlanService {
	
	// 생산계획목록조회
	public List<MfPlanVO> getMfPlanList();
	
	// 주문서목록조회
	public List<MfPlanVO> getOrderList();
	
	// 생산계획삭제목록조회
	public List<MfPlanVO> getMfDeletePlanList();
	
	// 생산계획등록
	public int insertMfPlan(MfPlanVO mfvo);
	
	// 생산계획삭제
	public int deleteMfPlan(MfPlanVO mfvo);
}
