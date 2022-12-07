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

	@Override
	public EmpVO selectEmpOne(String empNum) {
		
		return empMapper.selectEmpOne(empNum);
	}

	
	// 사원 등록.
	@Override
	public int inEmpInfo(EmpVO vo) {
		
		return empMapper.insertEmpInfo(vo);
	}

	// 사원 수정.
	@Override
	public int upEmpInfo(EmpVO vo) {
		
		return empMapper.updateEmp(vo);
	}

	// 사원 삭제.
	@Override
	public int delEmpInfo(List<EmpVO> vo) {
		int result = 0;
		for(EmpVO one: vo) { // 향상된 for문
			result += empMapper.deleteEmp(one);
		}
		if(vo.size() == result) {
			return result;
		}
		
		return 0 ;
	}


	@Override
	public EmpVO sessionEmp(EmpVO vo) {
		
		return empMapper.sessionEmp(vo);
	}
	

}
