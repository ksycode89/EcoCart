package com.cart.eco.common.mapper;

import java.util.List;

import com.cart.eco.common.service.ProAllVO;
import com.cart.eco.common.service.ProductVO;

public interface ProductMapper {
	
	//제품검색 이름:코드만
	public List<ProductVO> selectName();
	
	// 물품 조회.
	public List<ProAllVO> selectPro(ProAllVO vo);
	// 물품 등록.
	public int insertPro(ProAllVO vo);
	// 물품 옵션 등록.
	public int insertProOption(ProAllVO vo);
	// 물품 수정.
	public int updatePro(ProAllVO vo);
	// 물품 옵션 수정.
	public int updateProInfo(ProAllVO vo);
	// 물품 삭제.
	public int deletePro(ProAllVO vo);
	// 물품 옵션 삭제.
	public int deleteProInfo(ProAllVO vo);
}
