package com.cart.eco.common.mapper;

import java.util.List;

import com.cart.eco.common.service.EmpVO;

public interface EmpMapper {

	// 사원 전체 조회.
	public List<EmpVO> selectEmpList(EmpVO vo);
	
	// 사원 등록.
	
	
	// 담당자의 담당사원 조회.
	public EmpVO selectManager(String manager);
	
	// 사원 조회
	public EmpVO selectEmpOne(String empNum);

	// 담당자 조회.
	public List<EmpVO> selectM(EmpVO vo);
}
