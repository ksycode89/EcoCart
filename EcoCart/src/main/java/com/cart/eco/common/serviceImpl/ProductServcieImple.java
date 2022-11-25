package com.cart.eco.common.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.common.mapper.ProductMapper;
import com.cart.eco.common.service.ProductService;
import com.cart.eco.common.service.ProductVO;
@Service
public class ProductServcieImple implements ProductService {
	
	@Autowired ProductMapper proMapper;
		
	@Override
	public List<ProductVO> selectName() {
		return proMapper.selectName();
	}

	@Override
	public List<ProductVO> insertPro() {
		
		return proMapper.insertPro();
	}

}
