package com.cart.eco.mf.serviceImpl;

import java.util.List;
import java.util.Map;

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
	public List<Map<String, Object>> getMfSystemList(String sysDiv) {
		return mapper.getMfSystemList(sysDiv);
	}

	@Override
	public int updateMfSystem(List<MfProcessVO> vo) {
		int result = 0;
		for(int i=0; i<vo.size(); i++) {
			result += mapper.updateMfSystem(vo.get(i));
		}
		return result;
	}

	@Override
	public int updateSystemUsing(List<MfProcessVO> vo) {
		int result = 0;
		for(int i=0; i<vo.size(); i++) {
			result += mapper.updateSystemUsing(vo.get(i));
		}
		return result;
	}

	@Override
	public int updateSystemUnusing(List<MfProcessVO> vo) {
		return mapper.updateSystemUnusing(vo.get(0));
	}

}