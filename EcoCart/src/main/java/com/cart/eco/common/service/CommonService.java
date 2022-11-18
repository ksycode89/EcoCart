package com.cart.eco.common.service;

import java.util.List;

public interface CommonService {
	
	// 공통코드 - 부서코드, 부서이름 조회
	public List<CommonVO> getDept();

	
	//거래처리스트
	   public List<ClientVO>callClient();
	//공통코드리스트
	   public List<CommonVO>callCommon(CommonVO vo);
	
	
	
}
