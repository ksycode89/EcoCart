package com.cart.eco.common.mapper;

import java.util.List;

import com.cart.eco.common.service.ProductVO;

public interface ProductMapper {
	//제품검색 이름:코드만
	public List<ProductVO>selectName();

}
