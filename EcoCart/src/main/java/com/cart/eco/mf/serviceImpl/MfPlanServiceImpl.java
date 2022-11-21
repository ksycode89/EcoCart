package com.cart.eco.mf.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.mf.mapper.MfPlanMapper;
import com.cart.eco.mf.service.MfPlanService;
import com.cart.eco.mf.service.MfPlanVO;

@Service
public class MfPlanServiceImpl implements MfPlanService {

	@Autowired
	MfPlanMapper mapper;
	
	@Override
	public List<MfPlanVO> getMfPlanList() {
		return mapper.getMfPlanList();
	}

	@Override
	public List<MfPlanVO> getOrderList() {
		return mapper.getOrderList();
	}

	@Override
	public int insertMfPlan(MfPlanVO mfvo) {
		return mapper.insertMfPlan(mfvo);
	}

	@Override
	public List<MfPlanVO> getMfDeletePlanList() {
		return mapper.getMfDeletePlanList();
	}
	
	@Override
	public int deleteMfPlan(MfPlanVO mfvo) {
		return mapper.deleteMfPlan(mfvo);
	}

}
