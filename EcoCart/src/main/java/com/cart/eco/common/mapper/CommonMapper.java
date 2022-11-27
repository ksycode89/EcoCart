package com.cart.eco.common.mapper;

import java.util.List;

import com.cart.eco.common.service.ClientVO;
import com.cart.eco.common.service.CommonVO;
import com.cart.eco.common.web.CommonController;



public interface CommonMapper {
	
	// 공통코드 - 부서코드, 부서이름 조회
	public List<CommonVO> selectDept();
	
	// 공통코드 - 품목군코드, 품목군명 조회
	public List<CommonVO> selectProItem();
	
	
    //거래처리스트
	public List<ClientVO>callClient();
		  
    //공통코드리스트
    public List<CommonVO>callCommon(CommonVO vo);
    
   //공통코드추가
    public int callInsert(CommonVO vo);
    //공통코드 수정
    public int callupdate(CommonVO vo);
    //공통코드 삭
    public int callDelete(CommonVO vo);
    
    //공통 코드 그룹으로 찾기
    public List<CommonVO> selectWHCC (CommonVO vo);
    
    
		

}
