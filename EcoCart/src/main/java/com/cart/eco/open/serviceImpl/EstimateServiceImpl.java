package com.cart.eco.open.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.open.mapper.EstimateMapper;
import com.cart.eco.open.service.EstimateService;
import com.cart.eco.open.service.EstimateVO;

@Service
public class EstimateServiceImpl implements EstimateService {

	@Autowired
	EstimateMapper mapper;
	
	
	@Override
	public List<EstimateVO> selectEstimateList() {
		// TODO Auto-generated method stub
		return mapper.selectEstimateList();
	}

	@Override
	public int getEstimateNo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertEstimate(EstimateVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	//견적서 상세 조회
	@Override
	public List<Map<String, Object>> EstimateDList(String estmtCode) {
		// TODO Auto-generated method stub
		return mapper.EstimateDList(estmtCode);
	}

	@Override
	public int updateEstimate(EstimateVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String selectBox() {
		return mapper.selectBox();
		
	}

	
}
