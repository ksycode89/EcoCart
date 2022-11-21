package com.cart.eco.common.mapper;

import java.util.List;

import com.cart.eco.common.service.EmpVO;

public interface EmpMapper {

	// 사원 조회.
	public List<EmpVO> selectEmpList(EmpVO vo);
	
	// 담당자 조회.
	public EmpVO selectManager(String manager);

}
