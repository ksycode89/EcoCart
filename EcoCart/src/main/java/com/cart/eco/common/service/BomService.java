package com.cart.eco.common.service;

import java.util.List;

public interface BomService {
	//bom 조회
	public List<BomVO>  bomList(BomVO vo);
	//bom 자제품
	public List<BomChildernVO>  bomChildren(BomVO vo);
	
	//모제품 등록
	public BomVO bomInsert(BomVO vo);
	
	public  String bomInsertOP(List<BomChildernVO> vo);
	//반제자불러오기 
	public List<BomVO> getChildPro();

	

}
