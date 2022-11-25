package com.cart.eco.common.mapper;

import java.util.List;

import com.cart.eco.common.service.BomVO;

public interface BomMapper {
	
	    //모제품 등록
		public int bomInsert(BomVO vo);
		
		//bom 조회
		public List<BomVO>  bomList(BomVO vo);
		
		//bom 자제품
		public List<BomVO>  bomChildren(BomVO vo);


}
