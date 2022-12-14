package com.cart.eco.common.serviceImpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.common.mapper.CommonMapper;
import com.cart.eco.common.mapper.WarehouseMapper;
import com.cart.eco.common.service.ClientVO;
import com.cart.eco.common.service.CommonService;
import com.cart.eco.common.service.CommonVO;
import com.cart.eco.common.service.WHVO;

@Service
public class CommonServiceImpl implements CommonService {

	@Autowired	CommonMapper commonMapper;

	// 부서코드
	@Override
	public List<CommonVO> getDept() {
		
		return commonMapper.selectDept();
	}

	
	@Override
	   public List<ClientVO> callClient() {
	      
	      return commonMapper.callClient();
	   }

	   @Override
	   public List<CommonVO> callCommon(CommonVO vo) {
	      return commonMapper.callCommon(vo);
	   }


	@Override
	public int callInsert(CommonVO vo) {
		return commonMapper.callInsert(vo);
	}


	@Override
	public int callupdate(CommonVO vo) {
		return commonMapper.callupdate(vo);
	}


	@Override
	public int callDelete(CommonVO vo) {
		
		return commonMapper.callDelete(vo);
	}

	// 품목군코드
	@Override
	public List<CommonVO> getProItem() {
		
		return commonMapper.selectProItem();
	}
	// 상위공통코드 부르기 null
	@Override
	public List<CommonVO> commonGroupNull(){
		
		return commonMapper.commonGroupNull();
	}


	




	
	
}
