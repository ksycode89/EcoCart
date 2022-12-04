package com.cart.eco.common.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.common.mapper.WarehouseMapper;
import com.cart.eco.common.service.WHService;
import com.cart.eco.common.service.WHVO;

@Service
public class WHServiceImple implements WHService {

    @Autowired WarehouseMapper WHmapper;
    
    //창고리스트(where절 공통)
	@Override
	public List<WHVO> WHList(WHVO vo) {
		
		return WHmapper.WHList(vo);
	}

	@Override
	public int WHInsert(WHVO vo) {
		
		return WHmapper.WHInsert(vo);
	}

	@Override
	public int WHUpdate(WHVO vo) {
		
		return WHmapper.WHUpdate(vo);
	}
	//삭제
	@Override
	public int deleteWare(WHVO vo) {
		
		return WHmapper.deleteWare(vo);
	}

}
