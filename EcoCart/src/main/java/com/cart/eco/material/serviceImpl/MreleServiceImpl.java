package com.cart.eco.material.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.material.mapper.MreleMapper;
import com.cart.eco.material.service.MreleDetailVO;
import com.cart.eco.material.service.MreleService;
import com.cart.eco.material.service.MreleaseVO;

@Service
public class MreleServiceImpl implements MreleService {
	
	@Autowired
	MreleMapper mrmapper;
	
	@Override
	public String getReleasecode(MreleaseVO mrele) {
		// TODO Auto-generated method stub
		return mrele.getReleaseCode();
	}

	@Override
	public List<MreleaseVO> selectMrList() {
		return mrmapper.selectMrList();
	}

	@Override
	public List<MreleDetailVO> dataList(MreleaseVO mrele) {
		return mrmapper.dataList(mrele);
	}

}
