package com.cart.eco.common.mapper;

import java.util.List;

import com.cart.eco.common.service.EmpVO;

public interface EmpMapper {

	// 사원조회
	public List<EmpVO> selectEmpList();
	

}
