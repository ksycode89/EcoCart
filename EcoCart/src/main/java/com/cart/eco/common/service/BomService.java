package com.cart.eco.common.service;

import java.util.List;

public interface BomService {
	//모제품 등록
	public BomVO bomInsert(ToastGridVO<BomVO>  vo);
	//bom 조회
	public List<BomVO>  bomList(BomVO vo);
	//bom 자제품
	public List<BomVO>  bomChildren(BomVO vo);

}
