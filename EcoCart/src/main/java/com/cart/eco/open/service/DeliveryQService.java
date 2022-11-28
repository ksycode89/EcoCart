package com.cart.eco.open.service;

import java.util.List;
import java.util.Map;

import com.cart.eco.common.service.ClientVO;
import com.cart.eco.common.service.EmpVO;
import com.cart.eco.common.service.ProductVO;



public interface DeliveryQService {
	
	//출고 요청1
	
	//출고요청1 조회
	public List<DeliveryQVO> DeliveryQList();
	
	//출고요청1 상세 조회
	public List<Map<String,Object>> DeliveryQDList(String dlivyCode);
	
	//출고요청번호 가져오기
	public List<DeliveryQVO> getDlivyQCode();

	//충고요청 등록
	public int insertDlivyQ(List<DeliveryQVO> vo);
	
	//충고요청 상세 등록
	public int insertDlivyQD(List<DeliveryQDVO> vo);
	
	//요청 시 주문서 남품수량 +
	public int updateOrderNum(List<OrderDVO> vo);
	
	////////////////////////////////////////////////////////////////////////////
	
	//출고 등록2
	
	//출고등록2 조회
	public List<DeliveryGVO> DeliveryGList();
	
	//출고등록2 상세 조회
	public List<Map<String,Object>> DeliveryGDList(String dlivyCode);
	
	
	//모달창 출고요청 코드 조회
	public List<DeliveryQVO> MdeliveryQList();
		
	//모달창 출고요청 코드 조회
	public List<Map<String,Object>> MdeliveryQListD(String dlivyCode);
	
	//출고등록 번호 가져오기
	public List<DeliveryGVO> getDlivyGCode();
	
	//충고등록 등록
	public int insertDlivyG(List<DeliveryGVO> vo);
	
	//충고등록 상세 등록
	public int insertDlivyGD(List<DeliveryGDVO> vo);
	
	//요청 상태 업데디트
	public int updateQst(List<DeliveryQVO> vo);
	
	////////////////////////////////////////////////////////////////////////////
	
	//출고 처리3
	
	//출고처리 조회
	public List<DeliveryProVO> DeliveryPList();
	
	//출고처리 상세 조회
	public List<Map<String,Object>> DeliveryPDList(String dlivyCode);

	//모달창 출고등록 코드 조회
	public List<DeliveryQVO> MdeliveryGList(String dlivyCode);
			
	//모달창 출고등록 코드 상세 조회
	public List<Map<String,Object>> MdeliveryGListD(String dlivyCode);
	
	//출고처리 번호 가져오기
	public List<DeliveryProVO> getDlivytPCode();
	
	//충고처리 등록
	public int insertDlivyP(List<DeliveryProVO> vo);
	
	
	/////////////////////////////////////////////////////////////////////////////
	
	//배송 정보 조회
	
	public List<DeliveryProVO> DeliveryInfoList();

	
	//배송정보 업데이트
	public int updateInfo(DeliveryProVO vo);
	
	
	/////////////////////////////////////////////////////////////////////////////
	
	// 제품 재고 현황
	public List<ProductVO> productList();

		
	// BOM 수급 현황
	public List<Map<String, Object>> bomList(String proCode);
	
	
	
	//셀렉트 옵션
	public List<ProductVO> selectProCode();
	public List<ClientVO> selectClientName();
	public List<EmpVO> selectEmp();
	public List<DeliveryGVO> selectDeliveryQ();
	public List<DeliveryQVO> selectDeliveryG();
	public List<DeliveryProVO> selectDeliveryP();
	public List<DeliveryProVO> selectBom();
	public List<OrdersVO> selectOrderCode();

	
	
	
	
	
	
	
	
	
	
}	
