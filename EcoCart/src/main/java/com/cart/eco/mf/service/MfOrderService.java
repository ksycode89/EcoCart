package com.cart.eco.mf.service;

import java.util.List;

public interface MfOrderService {
	
	//생산지시전체조회
	public List<MfOrderVO> getMfOrderList();
	
	//생산지시대기목록조회
	public List<MfOrderVO> getMfReadyOrderList();
	
	//생산계획목록조회
	public List<MfOrderVO> getMfReadyPlanList();
	
	//필요자재조회
	public List<MfOrderVO> getMfOrderMaterialList(MfOrderVO mfvo);
	
	//필요자재LOT조회
	
	//생산지시등록
	
	//필요자재LOT등록
	
	//생산지시확정변경
}