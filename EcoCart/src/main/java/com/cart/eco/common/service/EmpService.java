package com.cart.eco.common.service;

import java.util.List;

public interface EmpService {

	// 사원 조회.
	public List<EmpVO> getEmpList(EmpVO vo);
	
	// 사원 등록.
	public int inEmpInfo(EmpVO vo);
	
	// 사원 수정.
	public int upEmpInfo(EmpVO vo);
	
	// 사원 삭제.
	public int delEmpInfo(List<EmpVO> vo);
	
	
	// 담당자 조회
	public List<EmpVO> selectM(EmpVO vo);

	
	
	// 담당자의 담당사원 조회.
	public EmpVO selectManager(String manager);

	//단건 사원 조회
	public EmpVO selectEmpOne(String empNum);

}
