package com.cart.eco.open.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.common.service.ClientVO;
import com.cart.eco.common.service.EmpVO;
import com.cart.eco.common.service.ProductVO;
import com.cart.eco.open.mapper.DeliveryQMapper;
import com.cart.eco.open.service.DeliveryGVO;
import com.cart.eco.open.service.DeliveryProVO;
import com.cart.eco.open.service.DeliveryQService;
import com.cart.eco.open.service.DeliveryQVO;
import com.cart.eco.open.service.EstimateVO;

@Service
public class DeliveryQServiceImpl implements DeliveryQService{
	
	@Autowired
	DeliveryQMapper mapper;

	//출고요청	Q
	
	@Override
	public List<DeliveryQVO> DeliveryQList() {
		// TODO Auto-generated method stub
		return mapper.DeliveryQList();
	}

	@Override
	public List<Map<String, Object>> DeliveryQDList(String dlivyCode) {
		// TODO Auto-generated method stub
		return mapper.DeliveryQDList(dlivyCode);
	}

	
	

	
	
	
	////////////////////////////////////////////////////////////////////////
	
	//출고등록 G
	
	@Override
	public List<DeliveryGVO> DeliveryGList() {
		// TODO Auto-generated method stub
		return mapper.DeliveryGList();
	}
	
	@Override
	public List<Map<String, Object>> DeliveryGDList(String dlivyCode) {
		// TODO Auto-generated method stub
		return mapper.DeliveryGDList(dlivyCode);
	}

	@Override
	public List<DeliveryQVO> MdeliveryQList(String dlivyCode) {
		// TODO Auto-generated method stub
		return mapper.MdeliveryQList(dlivyCode);
	}
	
	@Override
	public List<Map<String, Object>> MdeliveryQListD(String dlivyCode) {
		// TODO Auto-generated method stub
		return mapper.MdeliveryQListD(dlivyCode);
	}
	
	
	
	
	//////////////////////////////////////////////////////////////////////////
	
	//출고처리 Pro
	
	@Override
	public List<DeliveryProVO> DeliveryPList() {
		// TODO Auto-generated method stub
		return mapper.DeliveryPList();
	}

	@Override
	public List<Map<String, Object>> DeliveryPDList(String dlivyCode) {
		// TODO Auto-generated method stub
		return mapper.DeliveryPDList(dlivyCode);
	}
	
	@Override
	public List<DeliveryQVO> MdeliveryGList(String dlivyCode) {
		// TODO Auto-generated method stub
		return mapper.MdeliveryGList(dlivyCode);
	}
	
	@Override
	public List<Map<String, Object>> MdeliveryGListD(String dlivyCode) {
		// TODO Auto-generated method stub
		return mapper.MdeliveryGListD(dlivyCode);
	}
	
	/////////////////////////////////////////////////////////////////////////////
	
	//배송 정보 조회
	
	@Override
	public List<DeliveryProVO> DeliveryInfoList() {
		
		return mapper.DeliveryInfoList();
	}
	
	
	
	////////////////////////////////////////////////////////////////////////
	
	//제품 재고/BOM수급 현황
	
	@Override
	public List<ProductVO> productList() {
		// TODO Auto-generated method stub
		return mapper.productList();
	}

	@Override
	public List<Map<String, Object>> bomList(String proCode) {
		// TODO Auto-generated method stub
		return mapper.bomList(proCode);
	}
	
	
	
	
	//셀렉트 옵션
	@Override
	public List<ProductVO> selectProCode() {
		// TODO Auto-generated method stub
		return mapper.selectProCode();
	}

	@Override
	public List<ClientVO> selectClientName() {
		// TODO Auto-generated method stub
		return mapper.selectClientName();
	}

	@Override
	public List<EmpVO> selectEmp() {
		// TODO Auto-generated method stub
		return mapper.selectEmp();
	}

	@Override
	public List<DeliveryGVO> selectDeliveryQ() {
		// TODO Auto-generated method stub
		return mapper.selectDeliveryQ();
	}

	@Override
	public List<DeliveryQVO> selectDeliveryG() {
		// TODO Auto-generated method stub
		return mapper.selectDeliveryG();
	}

	@Override
	public List<DeliveryProVO> selectDeliveryP() {
		// TODO Auto-generated method stub
		return mapper.selectDeliveryP();
	}

	@Override
	public List<DeliveryProVO> selectBom() {
		// TODO Auto-generated method stub
		return mapper.selectBom();
	}


	
	
}

