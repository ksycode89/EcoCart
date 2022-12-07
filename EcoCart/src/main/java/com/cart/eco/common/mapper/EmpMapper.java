package com.cart.eco.common.mapper;

import java.util.List;

import com.cart.eco.common.service.EmpVO;

public interface EmpMapper {

	// 사원 전체 조회.
	public List<EmpVO> selectEmpList(EmpVO vo);
	
	// 사원 등록.
	public int insertEmpInfo(EmpVO vo);
	
	// 사원 수정.
	public int updateEmp(EmpVO vo);
	
	// 사원 삭제.
	public int deleteEmp(EmpVO vo);
	
	// 담당자의 담당사원 조회.
	public EmpVO selectManager(String manager);
	
	// 사원 조회(단건)
	public EmpVO selectEmpOne(String empNum);

	// 담당자 조회.
	public List<EmpVO> selectM(EmpVO vo);
	//세션용
	public EmpVO sessionEmp(EmpVO vo);
}
