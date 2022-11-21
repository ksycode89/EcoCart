package com.cart.eco.mf.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.mf.mapper.MfProcessMapper;
import com.cart.eco.mf.service.MfProcessService;
import com.cart.eco.mf.service.MfProcessVO;

@Service
public class MfProcessServiceImpl implements MfProcessService {

	@Autowired
	MfProcessMapper mapper;
	
	@Override
	public List<MfProcessVO> getMfProcessList() {
		return mapper.getMfProcessList();
	}

}
