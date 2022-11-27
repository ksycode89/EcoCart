package com.cart.eco.common.service;

import java.util.List;

public interface CommonService {
	
	// 공통코드 - 부서코드, 부서이름 조회
	public List<CommonVO> getDept();
	
	// 공통코드 - 품목군코드, 품목군명 조회.
	public List<CommonVO> getProItem();

	 
	//거래처리스트
	   public List<ClientVO>callClient();
	 //공통코드리스트
	   public List<CommonVO>callCommon(CommonVO vo);
	
	 //공통코드 추가
	  public int callInsert (CommonVO vo);
	  //공통코드 수정
	  public int callupdate(CommonVO vo);

	  //공통코드 삭제
	  public int callDelete(CommonVO vo);
	  
	 
	  
	
	
}
