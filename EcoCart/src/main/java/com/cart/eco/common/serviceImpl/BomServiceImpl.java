package com.cart.eco.common.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.common.mapper.BomMapper;
import com.cart.eco.common.service.BomService;
import com.cart.eco.common.service.BomVO;
import com.cart.eco.common.service.ToastGridVO;

@Service
public class BomServiceImpl  implements BomService{

	@Autowired BomMapper mapper;
	
	@Override
	public BomVO bomInsert(BomVO vo) {
			mapper.bomInsert(vo);
		
		
		return vo;
	}

	@Override
	public List<BomVO> bomList(BomVO vo) {
		// TODO Auto-generated method stub
		return mapper.bomList(vo);
	}

	@Override
	public List<BomVO> bomChildren(BomVO vo) {
		
		return mapper.bomChildren(vo);
	}

	

}
