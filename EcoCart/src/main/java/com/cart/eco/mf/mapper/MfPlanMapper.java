package com.cart.eco.mf.mapper;

import java.util.List;

import com.cart.eco.mf.service.MfPlanVO;

public interface MfPlanMapper {
	
	// 생산계획조회
	public List<MfPlanVO> getMfPlanList();
	
	// 주문서조회
	public List<MfPlanVO> getOrderList();

	// 생산계획삭제목록
	public List<MfPlanVO> getMfDeletePlanList();
	
	// 생산계획등록
	public int insertMfPlan(MfPlanVO mfvo);
	
	// 주문서상태변경
	public int updateOrderList(MfPlanVO mfvo);
	
	// 생산계획삭제
	public int deleteMfPlan(MfPlanVO mfvo); 
	
	// 생산계획삭제 - detail
	public int deleteMfPlan2(MfPlanVO mfvo); 
	
}
