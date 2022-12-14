package com.cart.eco.common.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.common.mapper.ProductMapper;

import com.cart.eco.common.service.ProAllVO;
import com.cart.eco.common.service.ProductService;
import com.cart.eco.common.service.ProductVO;

@Service
public class ProductServcieImple implements ProductService {
	
	@Autowired ProductMapper proMapper;
		
	@Override
	public List<ProductVO> selectName() {
		return proMapper.selectName();
	}

	// 물품 조회.
	@Override
	public List<ProAllVO> selectPro(ProAllVO vo) {
	
		return proMapper.selectPro(vo);
	}

	// 물품 등록.
	@Override
	public int insertPro(ProAllVO vo) {
		int res = proMapper.insertPro(vo);
		int data = 0;
		if(res == 1) {
			data = proMapper.insertProOption(vo);
		}
		
		return data;
	}

	// 물품 수정.
	@Override
	public int updateProInfo(ProAllVO vo) {
		int result = proMapper.updateProInfo(vo);
		int result2 = 0;
		if(result == 1) {
		 result2 = proMapper.updatePro(vo);
		
		}
		return result2;
	}

	// 물품 삭제.
	@Override
	public String deletePro(List<ProAllVO> vo) {
		int result2 = 0;
		
		for(ProAllVO one : vo ) {
		int result =0;	
		 result = proMapper.deleteProInfo(one);
		if(result == 1) {
			result2 = proMapper.deletePro(one);
		 	}
		}
		String mes = "삭제 실패!!! ("+ result2+"/"+ vo.size()+")" ;
		
		if(result2 == vo.size()) {
			mes = result2 + "건이 삭제되었습니다.";
		}
			
		return mes;
	}


	

	

}
