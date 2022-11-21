package com.cart.eco.mf.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.mf.mapper.MfOrderMapper;
import com.cart.eco.mf.service.MfOrderService;
import com.cart.eco.mf.service.MfOrderVO;

@Service
public class MfOrderServiceImpl implements MfOrderService {

	@Autowired
	MfOrderMapper mapper;
	
	@Override
	public List<MfOrderVO> getMfOrderList() {
		return mapper.getMfOrderList();
	}

	@Override
	public List<MfOrderVO> getMfReadyOrderList() {
		return mapper.getMfReadyOrderList();
	}

	@Override
	public List<MfOrderVO> getMfReadyPlanList() {
		return mapper.getMfReadyPlanList();
	}

	@Override
	public List<MfOrderVO> getMfOrderMaterialList(MfOrderVO mfvo) {
		return mapper.getMfOrderMaterialList(mfvo);
	}

}
