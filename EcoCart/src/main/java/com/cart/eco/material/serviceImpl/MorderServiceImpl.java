package com.cart.eco.material.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.material.mapper.MorderMapper;
import com.cart.eco.material.service.MorderService;
import com.cart.eco.material.service.MorderVO;
import com.cart.eco.material.service.MorderdetailVO;

@Service
public class MorderServiceImpl implements MorderService {
	
	//발주
	
	@Autowired
	MorderMapper moMapper;
	
	@Override
	public int getOrderNo(MorderVO morderVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MorderVO> selectOrderList() {
		// TODO Auto-generated method stub
		return moMapper.selectOrderList();
	}
	
	
	@Override
	public int insertOrder(MorderVO morderVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOrder(MorderVO morderVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<MorderdetailVO> detailList(MorderVO morderVO) {
		
		return moMapper.detailList(morderVO);
	}


}
