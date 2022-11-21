package com.cart.eco.common.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cart.eco.common.mapper.EmpMapper;
import com.cart.eco.common.service.EmpService;
import com.cart.eco.common.service.EmpVO;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	EmpMapper empMapper;

	@Override
	public List<EmpVO> getEmpList(EmpVO vo) {
		
		return empMapper.selectEmpList(vo);
	}

	@Override
	public EmpVO selectManager(String manager) {
		
		return empMapper.selectManager(manager);
	}

}
