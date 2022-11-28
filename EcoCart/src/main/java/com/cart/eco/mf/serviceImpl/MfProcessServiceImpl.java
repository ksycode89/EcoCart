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
	
	@Override
	public List<MfProcessVO> getMfSystemList() {
		return mapper.getMfSystemList();
	}

	@Override
	public int updateMfSystem(List<MfProcessVO> vo) {
		int result = 0;
		for(int i=0; i<vo.size(); i++) {
			result += mapper.updateMfSystem(vo.get(i));
		}
		return result;
	}


}