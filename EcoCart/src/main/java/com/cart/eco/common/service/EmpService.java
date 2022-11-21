package com.cart.eco.common.service;

import java.util.List;

public interface EmpService {

	// 사원조회
	public List<EmpVO> getEmpList(EmpVO vo);
	
	// 담당자 조회
	public List<EmpVO> selectM(EmpVO vo);
	
	
	// 담당자의 담당사원 조회.
	public EmpVO selectManager(String manager);

}
