package com.cart.eco.open.mapper;

import java.util.List;
import java.util.Map;

import com.cart.eco.common.service.ClientVO;
import com.cart.eco.common.service.ProductVO;
import com.cart.eco.open.service.EstimateDVO;
import com.cart.eco.open.service.EstimateVO;
import com.cart.eco.open.service.facilitiesVO;

public interface EstimateMapper {
	//
	
	//견적서 조회(승인X)
	public List<EstimateVO> selectEstimateList();
	
	//견적서 상세 조회
	public List<Map<String, Object>> EstimateDList(String estmtCode);
	
	
	
	//셀렉트 옵션 - 제품코드, 제품, 거래처명
	public List<ProductVO> selectProCode();
	public List<ClientVO> selectClientName();
	
	
	//견적서 등록
	public int insertEstmt(EstimateVO vo);

	public int insertEstmtD(EstimateDVO vo);
	
	//견적 번호 가져오기
	public List<EstimateVO> getEstmtCode();
	
	////////////////////////////////////////////////
	
	public List<facilitiesVO> facList();
	
	public int facInsert(facilitiesVO vo);
	
	public int facDelete(facilitiesVO vo);


}
