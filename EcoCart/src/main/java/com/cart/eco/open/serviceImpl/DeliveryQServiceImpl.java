package com.cart.eco.open.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.eco.common.service.ClientVO;
import com.cart.eco.common.service.EmpVO;
import com.cart.eco.common.service.ProductVO;
import com.cart.eco.open.mapper.DeliveryQMapper;
import com.cart.eco.open.service.DeliveryGDVO;
import com.cart.eco.open.service.DeliveryGVO;
import com.cart.eco.open.service.DeliveryProVO;
import com.cart.eco.open.service.DeliveryQDVO;
import com.cart.eco.open.service.DeliveryQService;
import com.cart.eco.open.service.DeliveryQVO;
import com.cart.eco.open.service.OrderDVO;
import com.cart.eco.open.service.OrdersVO;

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
	
	
	@Override
	public int insertDlivyQ(List<DeliveryQVO> vo,String empNum) {
		// TODO Auto-generated method stub
		
		
		int result = 0;
		for(int i = 0; i< vo.size(); i++) {
			System.out.println(vo.get(i).getEmpNum());
			vo.get(i).setEmpNum(empNum);
			System.out.println(vo.get(i).getEmpNum());
			result  += mapper.insertDlivyQ(vo.get(i));
		}
		
		return result;
		
	}

	@Override
	public int insertDlivyQD(List<DeliveryQDVO> list) {
		// TODO Auto-generated method stub
		int result = 0;
		OrderDVO a = new OrderDVO();
		for(int i = 0; i< list.size(); i++) {
			DeliveryQDVO dvo = list.get(i);
			a.setOrderCode(dvo.getOrderCode());
			a.setSoldNum(dvo.getDsellNum());
			a.setProCode(dvo.getProCode());
			mapper.updateOrderNum(a);
			result  += mapper.insertDlivyQD(dvo);
		}
		
		return result;
	}

	
	@Override
	public int updateOrderNum(List<OrderDVO> vo) {
		// TODO Auto-generated method stub
		int result = 0;
		for(int i = 0; i< vo.size(); i++) {
			
			result  += mapper.updateOrderNum(vo.get(i));
		}
		
		return result;
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
	public List<DeliveryQVO> MdeliveryQList() {
		// TODO Auto-generated method stub
		return mapper.MdeliveryQList();
	}
	
	@Override
	public List<Map<String, Object>> MdeliveryQListD(String dlivyCode) {
		// TODO Auto-generated method stub
		return mapper.MdeliveryQListD(dlivyCode);
	}
	
	@Override
	public int insertDlivyG(List<DeliveryGVO> vo, String empNum) {
		int result = 0;
		for(int i = 0; i< vo.size(); i++) {
			vo.get(i).setEmpNum(empNum);
			result  += mapper.insertDlivyG(vo.get(i));
		}
		return result;
	}

	@Override
	public int insertDlivyGD(List<DeliveryGDVO> vo) {
		int result = 0;
		for(int i = 0; i< vo.size(); i++) {
			
			result  += mapper.insertDlivyGD(vo.get(i));
		}
		return result;
	}
	

	@Override
	public int updateQst(List<DeliveryQVO> vo) {
		// TODO Auto-generated method stub
		int result = 0;
		for(int i = 0; i< vo.size(); i++) {
			
			result  += mapper.updateQst(vo.get(i));
		}
		return result;
	}			
		
	@Override
	public int updateProduct(List<ProductVO> vo) {
		int result = 0;
		for(int i = 0; i< vo.size(); i++) {
			
			result  += mapper.updateProduct(vo.get(i));
		}
		return result;
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
	
	@Override
	public int insertDlivyP(List<DeliveryProVO> vo) {
		int result = 0;
		for(int i = 0; i< vo.size(); i++) {
			
			result  += mapper.insertDlivyP(vo.get(i));
		}
		return result;
	}

	
	
	/////////////////////////////////////////////////////////////////////////////
	
	//배송 정보 조회
	
	@Override
	public List<DeliveryProVO> DeliveryInfoList() {
		
		return mapper.DeliveryInfoList();
	}
	
	@Override
	public int updateInfo(List<DeliveryProVO> vo) {
		// TODO Auto-generated method stub
			int result = 0;
			for(int i = 0; i< vo.size(); i++) {
				
				result  += mapper.updateInfo(vo.get(i));
			}
			return result;
		
	}

	
	//배솓 등록 조회 (등록만)
	@Override
	public List<DeliveryGVO> deliveryGst() {
		// TODO Auto-generated method stub
		return mapper.deliveryGst();
	}
	
	
	@Override
	public int updateGst(List<DeliveryGVO> vo) {
		// TODO Auto-generated method stub
		int result = 0;
		for(int i = 0; i< vo.size(); i++) {
			
			result  += mapper.updateGst(vo.get(i));
		}
		return result;
	}
	////////////////////////////////////////////////////////////////////////
	
	//제품 재고/BOM수급 현황
	
	@Override
	public List<ProductVO> productList() {
		// TODO Auto-generated method stub
		return mapper.productList();
	}

	
	@Override
	public List<ProductVO> productList2() {
		// TODO Auto-generated method stub
		return mapper.productList2();
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

	@Override
	public List<OrdersVO> selectOrderCode() {
		// TODO Auto-generated method stub
		return mapper.selectOrderCode();
	}
	
	
	
	
	//////////번호 가져오기
	
	
	
	@Override
	public List<DeliveryQVO> getDlivyQCode() {
		// TODO Auto-generated method stub
		return mapper.getDlivyQCode();
	}

	@Override
	public List<DeliveryGVO> getDlivyGCode() {
		// TODO Auto-generated method stub
		return mapper.getDlivyGCode();
	}

	@Override
	public List<DeliveryProVO> getDlivytPCode() {
		// TODO Auto-generated method stub
		return mapper.getDlivyPCode();
	}

	

	


	

	

	


	
	/////////////////////////////////////////////////
	


	

	


	
	
}

