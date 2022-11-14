package com.cart.eco.open.service;

import java.util.List;

public interface EstimateService {
	
	//견적서 조회(승인X)
	public List<EstimateVO> selectEstimateList();
	
	//견적 번호 가져오기
	public int getEstimateNo();
	
	//견적서 등록
	public int insertEstimate(EstimateVO vo);
}
