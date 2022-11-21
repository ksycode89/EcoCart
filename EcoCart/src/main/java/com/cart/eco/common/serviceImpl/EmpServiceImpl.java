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

	// 사원 전체 조회.
	@Override
	public List<EmpVO> getEmpList(EmpVO vo) {
		
		return empMapper.selectEmpList(vo);
	}

	
	// 담당자 조회
	@Override
	public List<EmpVO> selectM(EmpVO vo) {
		
		return empMapper.selectM(vo);
	}


	// 담당자의 담당사원 조회
	@Override
	public EmpVO selectManager(String manager) {
		
		return empMapper.selectManager(manager);
	}

	

}
