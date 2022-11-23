package com.cart.eco.open.service;

import java.util.List;
import java.util.Map;

import com.cart.eco.common.service.ClientVO;
import com.cart.eco.common.service.ProductVO;

public interface EstimateService {
	
	//견적서 조회(승인X)
	public List<EstimateVO> selectEstimateList();
	
	
//	//견적서 상세 조회
	public List<Map<String, Object>> EstimateDList(String estmtCode);


	//셀렉트 옵션 - 제품코드, 제품, 거래처명
	public List<ProductVO> selectProCode();
	public List<ClientVO> selectClientName();
	

	//견적서 등록
	public String insertEstmt(EstimateVO vo);

	public int insertEstmtD(List<EstimateDVO> vo);

	


//	//견적 번호 가져오기
//	public int getEstimateNo();
//
////승인 버튼 누르면 estmt_st update 
//public int updateEstimate(EstimateVO vo);








}