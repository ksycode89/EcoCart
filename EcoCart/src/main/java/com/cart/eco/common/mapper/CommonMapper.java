package com.cart.eco.common.mapper;

import java.util.List;

import com.cart.eco.common.service.ClientVO;
import com.cart.eco.common.service.CommonVO;



public interface CommonMapper {
	
	// 공통코드 - 부서코드, 부서이름 조회
	public List<CommonVO> selectDept();
	
	
    //거래처리스트
	public List<ClientVO>callClient();
		  
    //공통코드리스트
    public List<CommonVO>callCommon(CommonVO vo);
		

}
