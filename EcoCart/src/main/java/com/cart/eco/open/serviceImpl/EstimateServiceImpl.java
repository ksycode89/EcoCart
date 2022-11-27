package com.cart.eco.open.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.common.service.ClientVO;
import com.cart.eco.common.service.ProductVO;
import com.cart.eco.open.mapper.EstimateMapper;
import com.cart.eco.open.service.EstimateDVO;
import com.cart.eco.open.service.EstimateService;
import com.cart.eco.open.service.EstimateVO;

@Service
public class EstimateServiceImpl implements EstimateService {

	@Autowired
	EstimateMapper mapper;
	
	
	@Override
	public List<EstimateVO> selectEstimateList() {
		// TODO Auto-generated method stub
		return mapper.selectEstimateList();
	}

	
	//견적서 상세 조회
	@Override
	public List<Map<String, Object>> EstimateDList(String estmtCode) {
		// TODO Auto-generated method stub
		return mapper.EstimateDList(estmtCode);
	}


	
	//셀렉트 옵션
	@Override
	public List<ProductVO> selectProCode() {
		// TODO Auto-generated method stub
		return mapper.selectProCode();
	}

	//셀렉트 옵션
	@Override
	public List<ClientVO> selectClientName() {
		// TODO Auto-generated method stub
		return mapper.selectClientName();
	}


	@Override
	public String insertEstmt(EstimateVO vo) {

		
		return String.valueOf( mapper.insertEstmt(vo) );
	}


	@Override
	public int insertEstmtD(List<EstimateDVO> vo) {
		int result = 0;
		for(int i = 0; i< vo.size(); i++) {
			
			result  += mapper.insertEstmtD(vo.get(i));
		}
		
		return result;
	}

	
	


	@Override
	public List<EstimateVO> getEstmtCode() {
		// TODO Auto-generated method stub
		return mapper.getEstmtCode();
	}







	

	
	
}
