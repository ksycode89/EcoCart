package com.cart.eco.mf.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.mf.mapper.MfOrderMapper;
import com.cart.eco.mf.service.MfOrderService;
import com.cart.eco.mf.service.MfOrderVO;

@Service
public class MfOrderServiceImpl implements MfOrderService {

	@Autowired
	MfOrderMapper mapper;
	
	@Override
	public List<MfOrderVO> getMfOrderList() {
		return mapper.getMfOrderList();
	}

	@Override
	public List<MfOrderVO> getMfReadyOrderList() {
		return mapper.getMfReadyOrderList();
	}

	@Override
	public List<MfOrderVO> getMfReadyPlanList() {
		return mapper.getMfReadyPlanList();
	}

	@Override
	public List<Map<String, Object>> getMfOrderMaterialList(String proCode) {
		return mapper.getMfOrderMaterialList(proCode);
	}

	@Override
	public List<Map<String, Object>> getMfLotList(String proCode) {
		return mapper.getMfLotList(proCode);
	}
	
	@Override
	public List<MfOrderVO> getMfOrderCode() {
		return mapper.getMfOrderCode();
	}
	
	@Override
	public List<MfOrderVO> getReleaseCode() {
		return mapper.getReleaseCode();
	}
	
	@Override
	public int insertMfOrder(List<MfOrderVO> vo) {
		return mapper.insertMfOrder(vo.get(0));
	}

	@Override
	public int insertMfOrderDetail(List<MfOrderVO> vo) {
		int result = 0;
		for(int i=0; i<vo.size(); i++) {
			result += mapper.insertMfOrderDetail(vo.get(i));
		}
		return result;
	}

	@Override
	public int insertMfOrderLot(List<MfOrderVO> vo) {
		return mapper.insertMfOrderLot(vo.get(0));
	}

	@Override
	public int insertMfOrderLotDetail(List<MfOrderVO> vo) {
		int result = 0;
		for(int i=0; i<vo.size(); i++) {
			result += mapper.insertMfOrderLotDetail(vo.get(i));
		}
		return result;
	}

	@Override
	public int updateReceivingDetail(List<MfOrderVO> vo) {
		int result = 0;
		for(int i=0; i<vo.size(); i++) {
			result += mapper.updateReceivingDetail(vo.get(i));
		}
		return result;
	}

	@Override
	public int updateMfOrderLotDetail(List<MfOrderVO> vo) {
		int result = 0;
		for(int i=0; i<vo.size(); i++) {
			result += mapper.updateMfOrderLotDetail(vo.get(i));
		}
		return result;
	}
	
	@Override
	public int updateMfPlanStatus(MfOrderVO vo) {
		return mapper.updateMfPlanStatus(vo);
	}
	
	@Override
	public int decideMfOrder(MfOrderVO vo) {
		return mapper.decideMfOrder(vo);
	}


}