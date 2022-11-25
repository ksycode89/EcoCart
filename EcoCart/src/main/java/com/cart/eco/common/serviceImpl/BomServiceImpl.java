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
	public BomVO bomInsert(ToastGridVO<BomVO> vo) {
			
		int result=0;
    	for(BomVO wh : vo.getCreatedRows()) {
    		result += mapper.bomInsert(wh);
    	}
    	System.out.println("결과값 합산 : "+result);
		
		return vo.getCreatedRows().get(0);
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
