package com.cart.eco.open.serviceImpl;

import java.util.List;

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

}
