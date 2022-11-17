package com.cart.eco.open.service;

import java.util.List;
import java.util.Map;

public interface EstimateService {
	
	//견적서 조회(승인X)
	public List<EstimateVO> selectEstimateList();
	
	//견적 번호 가져오기
	public int getEstimateNo();
	
//	//견적서 상세 조회
	public List<Map<String, Object>> EstimateDList(String estmtCode);
	
	//견적서 등록(등록버튼)
	public int insertEstimate(EstimateVO vo);
	
	
	//승인 버튼 누르면 estmt_st update 
	public int updateEstimate(EstimateVO vo);


	public String selectBox();


}