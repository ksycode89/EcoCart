package com.cart.eco.common.service;

import java.util.List;

public interface ProductService {
	//물품이름검색리스트
	public List<ProductVO> selectName();
	
	// 물품 등록.
	public List<ProAllVO> insertPro(ProAllVO vo);
	// 물품 조회.
	public List<ProAllVO> selectPro(ProAllVO vo);
	// 물품 수정.
	
	// 물품 삭제.

}
