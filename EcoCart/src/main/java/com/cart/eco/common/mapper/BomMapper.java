package com.cart.eco.common.mapper;

import java.util.List;

import com.cart.eco.common.service.BomChildernVO;
import com.cart.eco.common.service.BomVO;

public interface BomMapper {
	
		
		//bom 조회
		public List<BomVO>  bomList(BomVO vo);
		
		//bom 자제품
		public List<BomVO>  bomChildren(BomVO vo);
		
		//모제품 등록
		public int bomInsert(BomVO vo);
		
		//bom option 등록
		public int bomInsertOP(BomChildernVO vo);


}
