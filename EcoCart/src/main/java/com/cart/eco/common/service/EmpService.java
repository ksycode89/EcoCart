package com.cart.eco.common.service;

import java.util.List;

public interface EmpService {

	// 사원조회
	public List<EmpVO> getEmpList(EmpVO vo);
	

	// 담당자 조회.
	public EmpVO selectManager(String manager);

}
