package com.cart.eco.mf.mapper;

import java.util.List;

import com.cart.eco.mf.service.MfPlanVO;

public interface MfPlanMapper {
	
	// 생산계획목록조회
	public List<MfPlanVO> getMfPlanList();
	
	// 주문서목록조회
	public List<MfPlanVO> getOrderList();

	// 완제품목록조회
	public List<MfPlanVO> getProductList();
	
	// 생산계획삭제목록조회
	public List<MfPlanVO> getMfDeletePlanList();
	
	// 생산계획등록
	public int insertMfPlan(MfPlanVO mfvo);
	
	// 주문서상태변경(미생산->생산중)
	public int updateOrderList(MfPlanVO mfvo);
	
	// 주문서상태변경(생산중->미생산)
	public int updateOrderListReturn(MfPlanVO mfvo);
	
	// 생산계획삭제
	public int deleteMfPlan(MfPlanVO mfvo); 
	
	// 생산계획상세삭제
	public int deleteMfPlan2(MfPlanVO mfvo); 
	
}
