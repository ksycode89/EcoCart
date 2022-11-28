package com.cart.eco.mf.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.mf.mapper.MfMakingMapper;
import com.cart.eco.mf.service.MfMakingService;
import com.cart.eco.mf.service.MfMakingVO;

@Service
public class MfMakingServiceImpl implements MfMakingService {
	
	@Autowired
	MfMakingMapper mapper;

	@Override
	public List<MfMakingVO> getMfResultList() {
		return mapper.getMfResultList();
	}
	
	@Override
	public List<Map<String, Object>> getMfFaultyList(String mfMakingCode) {
		return mapper.getMfFaultyList(mfMakingCode);
	}
	
	@Override
	public List<MfMakingVO> getMfOrderDecideList() {
		return mapper.getMfOrderDecideList();
	}
	
}
