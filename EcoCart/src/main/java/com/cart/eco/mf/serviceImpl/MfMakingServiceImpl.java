package com.cart.eco.mf.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.mf.mapper.MfMakingMapper;
import com.cart.eco.mf.service.MfMakingService;
import com.cart.eco.mf.service.MfMakingVO;

@Service
public class MfMakingServiceImpl implements MfMakingService {
	
	@Autowired
	MfMakingMapper mapper;

	@Override
	public List<MfMakingVO> getMfResultList() {
		return mapper.getMfResultList();
	}
	
	@Override
	public List<Map<String, Object>> getMfFaultyList(String mfMakingCode) {
		return mapper.getMfFaultyList(mfMakingCode);
	}
	
	@Override
	public List<MfMakingVO> getMfOrderDecideList() {
		return mapper.getMfOrderDecideList();
	}

	@Override
	public List<Map<String, Object>> getMfMakingTotal(String mfMakingCode) {
		return mapper.getMfMakingTotal(mfMakingCode);
	}

	@Override
	public List<Map<String, Object>> getMfMakingDetailList(String mfMakingCode) {
		return mapper.getMfMakingDetailList(mfMakingCode);
	}
	
	@Override
	public List<MfMakingVO> getMfMakingCode() {
		return mapper.getMfMakingCode();
	}
	
	@Override
	public int insertMakingProduct(List<MfMakingVO> vo) {
		return mapper.insertMakingProduct(vo.get(0));
	}

	@Override
	public int insertMakingResult(List<MfMakingVO> vo) {
		return mapper.insertMakingResult(vo.get(0));
	}

	@Override
	public int mfFinishLot(List<MfMakingVO> vo) {
		int result = 0;
		result += mapper.insertFinishLot(vo.get(0));
		result += mapper.updateProductNum(vo.get(0));
		return result;
	}
	
	@Override
	public int updateMakingResult(List<MfMakingVO> vo) {
		return mapper.updateMakingResult(vo.get(0));
	}

	@Override
	public int updateMfFinish(List<MfMakingVO> vo) {
		int result = 0;
		result += mapper.updateOrderFinish(vo.get(0));
		result += mapper.updateMfPlanFinish(vo.get(0));
		result += mapper.updateMfOrderFinish(vo.get(0));
		return result ;
	}

}
