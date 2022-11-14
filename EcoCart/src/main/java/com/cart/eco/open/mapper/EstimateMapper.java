package com.cart.eco.open.mapper;

import java.util.List;

import com.cart.eco.open.service.EstimateVO;

public interface EstimateMapper {
	
	//견적서 조회(승인X)
	public List<EstimateVO> selectEstimateList();
	
	//견적 번호 가져오기
	public int getEstimateNo();
	
	//견적서 등록
	public int insertEstimate(EstimateVO vo);
}
