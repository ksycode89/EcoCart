package com.cart.eco.material.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.material.mapper.ReceivingMapper;
import com.cart.eco.material.service.ReDetailService;
import com.cart.eco.material.service.ReDetailVO;

@Service
public class ReDetailServiceImple implements ReDetailService {
	@Autowired ReceivingMapper receMapper;
	
	//제품찾기(창고 ) - 입고테이블에서 
	@Override
	public List<ReDetailVO> collectPro(ReDetailVO vo) {
		return receMapper.collectPro(vo);
	}

}
